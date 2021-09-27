package BasicPgm;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scn.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			
			fact*=i;
			//this can also be written as
			//fact=fact*i;
		}
		System.out.println("factorial Of"+" "  + n + "="+" "+fact);
			
scn.close();
	}

}
