package algoritmos_pilas_colas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import LinearDataStructures.List;
import LinearDataStructures.Node;

public class makeApart {
public class party implements Node{
	public String nombre;
	public int precio;
	
	public party next=null;
	public party(String nombre,int precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	@Override
	public void setNext(Node node) {
		// TODO Auto-generated method stub
		this.next=(party)node;
	}
	@Override
	public Node getNext() {
		// TODO Auto-generated method stub
		return next;
	}
	@Override
	public Node clone() {
		// TODO Auto-generated method stub
		return null;
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
public void solutions() {
	try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new  BufferedWriter(new OutputStreamWriter(System.out));
		
		int amigos;
		int menores;
		int notoman;
		
		
		bw.write("¿Cuantos amigos son ?");
		bw.flush();
		amigos=Integer.parseInt(br.readLine());
		
		bw.write("\n");
		bw.write("¿Cuantos menores son ?");
		bw.flush();
		menores=Integer.parseInt(br.readLine());
		
		bw.write("\n");
		bw.write("¿Cuantos no toman ?");
		bw.flush();
		notoman=Integer.parseInt(br.readLine());
		
		
		makeAparty(amigos, menores, notoman);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
}
public static void main(String[] args) {
	makeApart a=new makeApart();
	a.solutions();
}
public static void makeAparty(int amigos , int menores, int notomancerveza){

	int productosbar[]=new int[] {280000,120000,8000};
	String nombres []=new String[] {"whiskey","schnapps","beer"};

	int amigostotal=amigos-menores;

	if (amigos%5==0 ) {
		int tanda=amigostotal/5;
		int cervezas=productosbar[2]*(amigos-menores-notomancerveza);
		System.out.println("gastos en bar ");
		for (int i = 0; i < nombres.length; i++) {

			productosbar[i]=productosbar[i]*tanda;
			productosbar[2]=cervezas;

			System.out.println(tanda +" "+productosbar[i]+"  "+ nombres[i]);
		}
	}			
}
}
