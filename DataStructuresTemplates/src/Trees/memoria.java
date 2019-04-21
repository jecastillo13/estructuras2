package Trees;

import LinearDataStructures.Node;

public class memoria implements Node {
	
	AVL_Node informacion = null;
	memoria next = null;
	
	public memoria(AVL_Node node) {
		informacion = node;
	}

	@Override
	public void setNext(Node node) {
		
		next = (memoria)node;
		
	}

	@Override
	public Node getNext() {
		
		return next;
	}

	@Override
	public Node clone() {
		
		return new memoria(this.informacion);
	}

	@Override
	public boolean isEqual(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLessThan(Node node) {
		// TODO Auto-generated method stub
		return false;
	}

}
