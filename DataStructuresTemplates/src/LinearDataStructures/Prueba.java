package LinearDataStructures;

import java.util.Arrays;

public class Prueba	implements Node{
	public int data;

	public Prueba next=null;

	public Prueba(int x) {
		this.data=x;
	}

	@Override
	public void setNext(Node node) {
		// TODO Auto-generated method stub
		this.next=(Prueba)node;
	}

	@Override
	public Node getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public Node clone() {
		// TODO Auto-generated method stub
		Prueba temp=new Prueba(this.data);
		return temp;
	}

	@Override
	public boolean isEqual(Node node) {
		Prueba temp=(Prueba)node;
		return this.data==temp.data;
	}

	@Override
	public boolean isLessThan(Node node) {
		Prueba temp=(Prueba)node;
		return this.data<temp.data;
	}

	public String toString() {
		return " "+this.data;
	}
	public static void main(String[] args) {
		List x= new List();
		//					Queue cola=new Queue();
		//					cola.enqueue(new Prueba(1));
		//					cola.enqueue(new Prueba(3));
		//																	cola.dequeue();
		//					cola.printQueue();
		for (int i = 0; i <10; i++) {
			x.insertAtEnd(new Prueba(i));
		}
//		x.printList();
//		System.out.println("----");
//		System.out.println(x.get(0).toString());
		
String s="holaddqueddhace";
System.out.println(Arrays.toString(s.split("dd")));


		//			x.insertAtEnd(new Prueba(1));
		//			x.insertAtIndex(new Prueba(5), 2);
		//			x.deleteAtEnd();

		//			System.out.println(x.get(3).toString());

		//x.insertAtIndex(new Prueba(0), 1);
		//x.printList();
	}
}