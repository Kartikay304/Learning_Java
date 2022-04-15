package unit_01;

import java.util.Scanner;

/*
 * Problem Statement: P7_Switchstatements:
 * Create a switch statement,in which:
 *        a.When you pass 1 your program will print current year
 *        b.When you pass 2 your program will print current month
 *        c.When you pass 3 your program will print current day
 *        d.When you pass 4 your program will print not applicable
 */

public class P7_SwitchStatements {

	public static void main(String[] args) {
		 SwitchStatements obj = new SwitchStatements();
		 obj.switchStatements();
	}
}

class SwitchStatements {
	void switchStatements() {
		System.out.print("MENU\n1.Current Year\n2.Current Month\n3.Current Day\nEnter your choice::");
		Scanner obj = new Scanner(System.in);
		int ch = obj.nextInt();
		switch(ch) {
		case 1: System.out.println("2022");
		break;
		case 2: System.out.println("April");
		break;
		case 3:	System.out.println("15");
		break;
		default: System.out.println("Invalid Choice");
		}
		obj.close();
	}
}
