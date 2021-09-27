package BasicPgm;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=scn.nextInt();
		int a=0;
		int b=1;
		int c;
		for(int i=1;i<=n;i++)
		{
		   c=a+b;
		   System.out.print(a+"\t");
		   a=b;
		   b=c;
		}
scn.close();
	}

}
