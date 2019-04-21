package Trees;

public class AVL_Node implements BinaryTreeNode{
	
	public int value = -1;
	public int unbalance_factor = 0;
	public BinaryTreeNode left = null;
	public BinaryTreeNode right = null;

	public AVL_Node(int value) {
		
		this.value = value;
	}
	@Override
	public void setLeft(BinaryTreeNode node) {
		left = (AVL_Node)node;
		
	}

	@Override
	public BinaryTreeNode getLeft() {
		
		return this.left;
	}

	@Override
	public void setRight(BinaryTreeNode node) {
		
		right = (AVL_Node)node;
		
	}

	@Override
	public BinaryTreeNode getRight() {
		return this.right;
	}

	@Override
	public BinaryTreeNode clone() {
		
		return new AVL_Node(this.value);
	}

	@Override
	public boolean isEqual(BinaryTreeNode node) {
		AVL_Node temp = (AVL_Node) node;
		return this.value == temp.value ? true : false;
	}

	@Override
	public boolean isLessThan(BinaryTreeNode node) {
		AVL_Node temp = (AVL_Node) node;
		return this.value < temp.value ? true : false;
	}

}
