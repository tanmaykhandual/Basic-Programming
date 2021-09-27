package BasicPgm;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scn= new Scanner (System.in);
		System.out.println("Enter a Number");
		int n=scn.nextInt();
		if (n%2==0) {
		
			System.out.println("the number is even");
			
		}
		else {
			System.out.println("Sala odd ha ba ya");
		}
		scn.close();

	}

}
