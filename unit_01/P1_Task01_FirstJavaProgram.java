package unit_01;

public class P1_Task01_FirstJavaProgram {
	public static void main(String args[]) {
		System.out.println("Hello World");
		calculator c=new calculator();
		c.addition(6,5);
		c.substract(6,5);
		c.multiply(6,5);
		c.divide(6,5);
	}
}

class calculator {
	void addition(int a,int b) {
		System.out.println(a+b);
	}
	
	void substract(int a,int b) {
	System.out.println(a-b);
	}
	
	void multiply(int a,int b) {
		System.out.println(a*b);
	}
	
	void divide(int a,int b) {
		System.out.println((float)a/b);
	}
}