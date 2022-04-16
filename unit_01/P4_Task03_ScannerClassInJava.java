package unit_01;

import java.util.Scanner;

/*When user takes input from the console!
 * 
 *  nextLine()         Read user input (to read Strings)
 *  next()             Read next token from the input entered by the user
 * 
 *  nextBoolean()      Reads a boolean value from the user
 *  nextByter()        Reads a byte value from the user
 *  nextDouble()       Reads a double value from the user
 *  nextFloat()        Reads a float value from the user
 *  nextInt()          Reads a int value from the user
 *  nextLong()         Reads along value from the user
 *  nextShort()        Reads a short value from the user
 * 
 */
public class P4_Task03_ScannerClassInJava {

	public static void main(String[] args) {
		Scanner myObj1 = new Scanner(System.in); // Create a Scanner Object
// 		Scanner myObj2 = new Scanner(System.in);
		
		//Read the First-Token(_space bar)
		String firstName=myObj1.next();
		System.out.println("Name is: "+firstName+"\n");
		
		myObj1.nextLine(); // As next() doesn't read '\n' new line character the nextLine() in line 31 reads the previous newline and thus don't give a chance to enter the input
		
		String name1 = myObj1.nextLine(); // (\n)
		String name2 = myObj1.nextLine(); // (\n)
		
		System.out.println("Name is: "+name1+"\n");
		System.out.println("Name is: "+name2+"\n");
		
		boolean b=myObj1.nextBoolean();
		System.out.println(b +"\n");
		
		myObj1.close();
		myObj2.close();
	}
}
