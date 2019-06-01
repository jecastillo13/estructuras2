package algoritmos_pilas_colas;
import java.util.*;
public class toMakeCocktail {
	public static void main(String[] args) {
		Scanner	 sc=new Scanner	(System.in);
		int numberOfFamily;
		int numberOfMinors;
		String answer1;
		int nottake;
		String answer2;

		System.out.println("How many relatives are?:");
		numberOfFamily=sc.nextInt();
		System.out.println("there are minors?");
		answer1=sc.next();
		
		if (answer1.equals("si")||answer1.equals("SI")) {
			System.out.println("how many ?:");
			numberOfMinors=sc.nextInt();
		}else {
			numberOfMinors=0;
		}
		System.out.println("Is there an adult who does not drink?");
		answer2=sc.next();
		if (answer2.equals("si")||answer2.equals("SI")) {
			System.out.println("How many?");
			nottake=sc.nextInt();				
		}else {
			nottake=0;
		}

		prepareCocktail(numberOfFamily, nottake, numberOfMinors);
	}
	public static void prepareCocktail(int familyMembers,int theydonotwant,int underage) {
		String[] ingredients=new String [] {"mL ron blanco","mL cola","mL zumo de limon ","unidades hielo","unidades vasos"};
		int[] amountOfIngredients=new int[]{50,120,10,3,1};
		int I=1;
		familyMembers+=I;
		familyMembers-=underage;
		familyMembers-=theydonotwant;

		System.out.println("______Cost in products______");
		for (int i = 0; i < amountOfIngredients.length; i++) {
			amountOfIngredients[i]=amountOfIngredients[i]*familyMembers;

			System.out.println(amountOfIngredients[i]+" __"+ingredients[i]);

		}
	}

}

