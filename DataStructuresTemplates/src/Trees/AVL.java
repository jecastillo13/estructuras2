package Trees;

import LinearDataStructures.*;

public class AVL {

	BinaryTree tree = new BinaryTree();


	BinaryTreeNode root = null; //

	/**
	 * 
	 */
	public AVL() {}


	/**
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		return root == null ? true : false;
	}
	
	


	/**
	 * 
	 * @param value
	 */
	public void insert(BinaryTreeNode node)
	{
		if(isEmpty())
		{
			root = node;
		}
		else
		{
			Stack path = new Stack();
			
			
			BinaryTreeNode temp = root;
			BinaryTreeNode parent = root;

			while(temp != null)
			{
				parent = temp;
				path.push(new memoria(temp));
				
				
				if(node.isLessThan(temp))
					temp = temp.getLeft();
				else
					temp = temp.getRight();
			}

			if(node.isLessThan(parent))
				parent.setLeft(node);
			else
				parent.setRight(node);
		}
	}


	/**
	 * 
	 * @param value
	 * @return
	 */
	public BinaryTreeNode search(BinaryTreeNode nodeToSearch)
	{
		BinaryTreeNode temp = root;

		while(temp != null)
		{
			if(temp.isEqual(nodeToSearch))
				break;
			else
				if(nodeToSearch.isLessThan(temp))
					temp = temp.getLeft();
				else
					temp = temp.getRight();
		}

		return temp;
	}


	/**
	 * 
	 * @param value
	 */
	public BinaryTreeNode getParent(BinaryTreeNode node) {
		BinaryTreeNode temp = root;
		BinaryTreeNode parent = root;
		while(temp != null) {

			if(node.isEqual(temp)) {
				break;
			}else {
				parent = temp;
				if(node.isLessThan(temp)) {
					temp = temp.getLeft();

				}else {
					temp = temp.getRight();
				}

			}

		}
		return parent;
	}
	public void delete(BinaryTreeNode nodeToDelete)
	{
		BinaryTreeNode parent  = getParent(nodeToDelete);


		if(isLeaf(nodeToDelete)) {

			if(nodeToDelete.isLessThan(parent)) 
				parent.setLeft(null);

			else 

				parent.setRight(null);
			nodeToDelete = null;
		}
		else {

		}if(oneChild(nodeToDelete)) {
			if(nodeToDelete.getLeft()!= null) 
				if(nodeToDelete.isLessThan(parent)) 
					parent.setLeft(nodeToDelete.getLeft());
				else 
					parent.setRight(nodeToDelete.getLeft());

			else 
				if(nodeToDelete.isLessThan(parent)) 
					parent.setLeft(nodeToDelete.getRight());
				else 
					parent.setRight(nodeToDelete.getRight());
			nodeToDelete = null;
		}else {
			BinaryTreeNode temp = nodeToDelete.getLeft();
			BinaryTreeNode temp_parent = nodeToDelete;

			while(temp.getRight() != null) {
				temp_parent = temp;
				temp = temp.getRight();


			}
			if(temp_parent.isEqual(nodeToDelete)) {

				temp.setRight(nodeToDelete.getRight());

				if(nodeToDelete.isLessThan(parent)) 
					parent.setLeft(temp);
				else 
					parent.setRight(temp);

			}else {

				temp_parent.setRight(temp.getLeft());

				temp.setLeft(nodeToDelete.getLeft());
				temp.setRight(nodeToDelete.getRight());

				if(nodeToDelete.isLessThan(parent)) 
					parent.setLeft(temp);
				else 
					parent.setRight(temp);
			}



		}


	}


	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean isLeaf(BinaryTreeNode node)
	{
		return (node.getLeft() == null && node.getRight() == null) ? true : false;
	}


	/**
	 * 
	 * @param node
	 * @return
	 */
	public boolean oneChild(BinaryTreeNode node)
	{
		return (node.getLeft() != null && node.getRight() != null) ? false : true;
	}


	/**
	 * 
	 * @param node
	 */
	public void preorder(BinaryTreeNode node)
	{
		if(node != null)
		{
			System.out.print(node.toString() + " ");
			preorder(node.getLeft());
			preorder(node.getRight());
		}
	}


	/**
	 * 
	 * @param node
	 */
	public void postorder(BinaryTreeNode node)
	{
		if(node != null)
		{
			postorder(node.getLeft());
			postorder(node.getRight());
			System.out.print(node.toString() + " ");
		}

	}


	/**
	 * 
	 * @param node
	 */
	public void inorder(BinaryTreeNode node)
	{
		if(node != null)
		{
			inorder(node.getLeft());
			System.out.print (node.toString() + " ");
			inorder(node.getRight());
		}

	}
}



