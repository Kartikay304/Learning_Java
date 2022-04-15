package unit_01;
/*Problem Statement:
 * Create separate logic in separate function
 * F1 - Check the entered string is palindrome  or not?
 * F2 - Make a reverse of a string
 * F3 - String compare: Check if the strings are equal or not?
 */
import java.util.Scanner;

public class P8_String {

	public static void main(String[] args) {
		QuestionsOnString obj = new QuestionsOnString();
		Scanner obj1 = new Scanner(System.in);
		String s1 = obj1.next();
		obj.palindomeOrNot(s1);
		obj.reverseOfAString(s1);
		obj.stringEqualOrNot(s1);
		obj1.close();
	}
}

class QuestionsOnString {
	void palindomeOrNot(String s1) {
		for(int i=0;i<s1.length()/2;i++) {
			if(s1.charAt(i)!=s1.charAt(s1.length()-i-1)) {
				System.out.println("The entred string is not palindrome");
				return;
			}
		}
		System.out.println("The entred string is a palindrome");
	}
	
	void reverseOfAString(String s1) {
		StringBuffer s2 = new StringBuffer();
		for(int i=0;i<s1.length();i++) {
			s2.insert(i,s1.charAt(s1.length()-i-1));
		}
		System.out.println("The reversed string is::"+s2);
	}
	
	void stringEqualOrNot(String s1) {
		Scanner obj = new Scanner(System.in);
		String s2 = obj.next();
		obj.close();
		if(s1.length()!=s2.length()) {
			System.out.println("The strings are not equall");
			return;
		}
		else {
			for(int i=0;i<s1.length();i++) {
				if(s1.charAt(i)!=s2.charAt(i)) {
					System.out.println("The strings are not equall");
					return;
				}
			}
			System.out.println("The strings are equall");
		}
	}
}
