package LinearDS_Problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

import LinearDataStructures.Node;
import LinearDataStructures.Queue;


//https://www.hackerearth.com/practice/data-structures/queues/basics-of-queues/practice-problems/algorithm/little-monk-and-goblet-of-fire/

public class LittleMonkAndGobletOfFire {
	public  class ProblemNode implements Node{
		//		public int school;
		//		public int roll;

		public String[] studen;

		public ProblemNode next=null;
		public ProblemNode(String[] studen) {
			//			this.school=school;
			//			this.roll=roll;
			this.studen=studen;


		}
		@Override
		public void setNext(Node node) {
			this.next=(ProblemNode)node;

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
		public String  toString() {
			return " "+this.studen;

		}
	}
	public void solution() {
		try {
			BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
			String x =br.readLine();
			//			int school=0;
			//			int roll=0;
			String studen;
			while(x!=null) {
				Queue fila=new Queue();
				int numberCase =Integer.parseInt(x);
				String [] input=br.readLine().split(" ");

				String [] input2=new String [2];
				for (int i = 0; i < numberCase; i++) {
					String E =input[0];	
					//					school=Integer.parseInt(input[1]);
					//					roll=Integer.parseInt(input[2]);
					studen =input2[1]+input2[2];

					input2[i]=studen;
					radixSort1(input2, '0', '9');
				}


				fila.enqueue(new ProblemNode(input2));
				fila.printQueue();
			}


		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		LittleMonkAndGobletOfFire a=new LittleMonkAndGobletOfFire();
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
