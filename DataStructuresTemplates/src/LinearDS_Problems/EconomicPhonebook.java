package LinearDS_Problems;
//https://www.urionlinejudge.com.br/judge/en/problems/view/1211


import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

import LinearDataStructures.*;



public class EconomicPhonebook {
	public class PhoneNumbers  implements Node{
		public int [] data;

		public PhoneNumbers next=null;
		public PhoneNumbers(int[] numer) {
			this.data=numer;
		}

		@Override
		public void setNext(Node node) {
			// TODO Auto-generated method stub
			this.next=(PhoneNumbers)node;
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
			PhoneNumbers temp=(PhoneNumbers)node;
			return this.data==temp.data ? true : false;
		}

		@Override
		public boolean isLessThan(Node node) {
			// TODO Auto-generated method stub
			return false;
		}
		public String  toString() {

			return Arrays.toString(this.data);

		}

	}
	public void solution() {
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			String x=br.readLine();
			List list=new List();


			int aux=0;

			while(x!=null ) {
				int  numberCase =Integer.parseInt(x);
				

				for (int i = 0; i < numberCase; i++) {
					String a =br.readLine();
;

				}

				list.insertAtEnd(new PhoneNumbers(array ));

				list.printList();
//				PhoneNumbers temp1 =(PhoneNumbers)list.head;
//				PhoneNumbers temp2 =(PhoneNumbers)list.head.getNext();
//
//				for (int i = 0; i < temp1.data.length; i++) {
//					if (temp1.data[i].equals(temp2.data[i])) {
//						aux++;
//						System.out.println(aux);
//					}
//					else {
//
//						break;	
//					}
//				}
//				temp1=temp2;
//			    temp2=(PhoneNumbers) temp1.getNext();
//			


			}
			
			//x=br.readLine();
		} catch (Exception e) {
			// TODO: handle exception
		}


	} 
	public static void main(String[] args)
	{
		EconomicPhonebook a=new EconomicPhonebook();
		a.solution();
	}
	public static void radixSort1(String[] arr,char lower,char upper) {
		int maxIndex=0;
		for(int i =0; i < arr.length;i++){
			if(arr[i].length()-1 > maxIndex) {
				maxIndex=arr[i].length()-1;
			}
		}
		for(int i=maxIndex;i >=0;i--) {
			countingSort(arr,i,lower,upper);
		}
	}
	public static void countingSort(String[] arr,int index,char lower,char upper){
		int[] countArray = new int[(upper-lower)+2];
		String[] tempArray = new String[arr.length];
		Arrays.fill(countArray,0);

		//increase count for char at index
		for(int i=0;i<arr.length;i++){
			int charIndex = (arr[i].length()-1 < index) ? 0 : ((arr[i].charAt(index) - lower)+1);
			countArray[charIndex]++;
		}

		//sum up countArray;countArray will hold last index for the char at each strings index
		for(int i=1;i<countArray.length;i++){
			countArray[i] += countArray[i-1];
		}

		for(int i=arr.length-1;i>=0;i--){
			int charIndex = (arr[i].length()-1 < index) ? 0 : (arr[i].charAt(index) - lower)+1;
			tempArray[countArray[charIndex]-1] = arr[i];
			countArray[charIndex]--;
		}

		for(int i=0;i<tempArray.length;i++){
			arr[i] = tempArray[i];   
		}
	}
}
