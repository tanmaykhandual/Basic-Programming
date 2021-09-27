package BasicPgm;

import java.util.Scanner;

public class weekName {

	public static void main(String[]args) {
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the number of day");
		int d = scn.nextInt();
		switch(d) {
		case 1:System.out.println("Monday");
		break;
		case 2:System.out.println("Tuesday");
		break;
		case 3:System.out.println("wednesday");
		break;
		case 4:System.out.println("thu");
		break;
		case 5:System.out.println("Friday");
		break;
		case 6:System.out.println("Saturday");
		break;
		case 7:System.out.println("sunday");
		break;
		default:System.out.println("invalid input");
		}
		scn.close();
		
		
	}

}
