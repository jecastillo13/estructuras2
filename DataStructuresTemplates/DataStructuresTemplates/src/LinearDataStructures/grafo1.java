package LinearDataStructures;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class grafo1 {
	NodoGrafo dato ;
	List list;


	public grafo1() {

		this.list=new List();

	}
	public void insert_edge(int toSearch, int toConnect) {


		if (contains(new NodoGrafo(toSearch))) {
			NodoGrafo temp=(NodoGrafo) list.linealSearch(new NodoGrafo(toSearch));
			temp.aristas.insertAtEnd(new NodeArist(toConnect));


		} else {
			insertarNodo(new NodoGrafo(toSearch));
			NodoGrafo temp2=(NodoGrafo) list.linealSearch(new NodoGrafo(toSearch));
			temp2.aristas.insertAtEnd(new NodeArist(toConnect));
		}
		
	}
	public void insertarNodo(NodoGrafo dato) {
		list.insertAtEnd(dato);
	}
	

	public boolean contains(NodoGrafo dato_1 ) {
		if (list.linealSearch(dato_1)!= null) {
			return true;
		}else {
			return false;
		}
	}
	public void printGrafo() {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		NodoGrafo temp=(NodoGrafo)list.head;
		try {
			while(temp != null) {


				bw.write(temp.toString()+": ");
				bw.flush();
				
				
				temp.aristas.printList();
				bw.write("\n");
				temp=(NodoGrafo)temp.getNext();
			}
			bw.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
