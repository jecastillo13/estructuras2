package algoritmos_pilas_colas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import LinearDataStructures.List;
import LinearDataStructures.Node;



public class DoMarke {
public class Produ implements Node{
	public  String produ;
	public int aux;
	
	public Produ next=null;
	public Produ(int aux, String produ) {
		this.produ=produ;
		this.aux=aux;
		
	}
	@Override
	public void setNext(Node node) {
		this.next=(Produ)node;
		
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
		Produ temp=(Produ)node;
		return this.aux==temp.aux ? true : false;
	
	}
	@Override
	public boolean isLessThan(Node node) {
		// TODO Auto-generated method stub
		return false;
	}
	public String toString() {
		return   "\n"+(char)this.aux +": "+this.produ;
	}
}
public void solution() {
	try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		int aux=65;
		
		
		bw.write("______Available item______");
		bw.write("\n ");
		bw.flush();
	
		List  marketPlaceList= new List();		
		marketPlaceList.insertAtEnd(new Produ( (char)aux++, "1LB-rice = $1.800"));
		marketPlaceList.insertAtEnd(new Produ( (char)aux++, "1-chiken = $10.000"));
		marketPlaceList.insertAtEnd(new Produ( (char)aux++, "1LT-milk = $2.800"));
		marketPlaceList.insertAtEnd(new Produ( (char)aux++, "1LB-pasta = $1.400 "));
		marketPlaceList.insertAtEnd(new Produ( (char)aux++, "1LT-juice = $2.900"));
		marketPlaceList.insertAtEnd(new Produ( (char)aux++, "1LB-lentil = $1.750"));
		marketPlaceList.insertAtEnd(new Produ( (char)aux++, "cookies = $800"));
		marketPlaceList.insertAtEnd(new Produ( (char)aux++, "1LB-salt = $1.350"));
		marketPlaceList.insertAtEnd(new Produ( (char)aux++, "1-beer = $1.800"));
		marketPlaceList.insertAtEnd(new Produ( (char)aux++, "1-sausages = $1.200"));
	
		marketPlaceList.printList();
		bw.write("\n");

		bw.write("\n");
		bw.write("___Choose the letter of the list of products.___");
		bw.write("\n ");
		bw.flush();
		
		String number;
		number=br.readLine();
		
		bw.write("_____TotalToPay: "+ "$"+costs(number)+"_____");
		bw.write("\n"+"\n");
		
		bw.write("___Enter money available___");
		bw.write("\n");
		bw.flush();
		
		int money=Integer.parseInt(br.readLine());
		if (money < costs(number)) {
			int moneyNeeded=Math.abs(money-costs(number));
			bw.write("Money Needed: "+"$"+moneyNeeded);
			bw.flush();
		}else {
			int cambio=money-costs(number);
			bw.write("Change: "+ "$"+ cambio);
			bw.flush();
		}
		
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
public static void main(String[] args) {
	DoMarke a=new  DoMarke();
	a.solution();
}
public static int costs(String number) {
	int pro1=0;
	int pro2=0;
	int pro3=0;
	int pro4=0;
	int pro5=0;
	int pro6=0;
	int pro7=0;
	int pro8=0;
	int pro9=0;
	int pro10=0;

	int costs = 0;

	for (int i = 0; i <number.length(); i++) {	
		if (number.charAt(i)=='A'||number.charAt(i)=='a' ) {
			pro1++;
		}
		if (number.charAt(i)=='B'||number.charAt(i)=='b') {
			pro2++;
		}
		if (number.charAt(i)=='C'||number.charAt(i)=='c') {
			pro3++;	
		}
		if (number.charAt(i)=='D'||number.charAt(i)=='d') {
			pro4++;	
		}	
		if (number.charAt(i)=='E'||number.charAt(i)=='e') {
			pro5++;	
		}
		if (number.charAt(i)=='F' ||number.charAt(i)=='f') {
			pro6++;	
		}
		if (number.charAt(i)=='G'||number.charAt(i)=='g') {
			pro7++;	
		}
		if (number.charAt(i)=='H'||number.charAt(i)=='h') {
			pro8++;	
		}
		if (number=="I"||number.charAt(i)=='i') {
			pro9++;	
		}
		if (number=="J"||number.charAt(i)=='j') {
			pro10++;	
		}
	}
	return costs=(pro1*1800)+(pro2*10000)+(pro3*2800)+(pro4*1400)+(pro5*2900)+(pro6*1750)+(pro7*800)+(pro8*1350)+(pro9*1800)+(pro10*1200);


}
}
