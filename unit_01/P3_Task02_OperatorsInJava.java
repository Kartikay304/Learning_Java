package unit_01;

public class P3_Task02_OperatorsInJava {

	public static void main(String[] args) {
		OperatorsInJava obj = new OperatorsInJava();
		
		obj.unaryop();
		obj.arithmetic();
		obj.shiftop();
		obj.relationalop();
		obj.bitwiseAndLogical();
		obj.ternaryop();
		obj.assignop();
	}
}

class OperatorsInJava {
	void unaryop() {
		int a=10;
		System.out.println(a++); //10
		System.out.println(++a); //12
		System.out.println(a--); //12
		System.out.println(--a); //10
	}
	
	void arithmetic() {
		int a=10,b=5;
		System.out.println(a+b); //15
		System.out.println(a-b); //5
		System.out.println(a*b); //50
		System.out.println(a/b); //2
		System.out.println(a%b); //0
	}
	
	void shiftop() {
		System.out.println(10<<2); //40
		System.out.println(10>>2); //2
	}
	
	void relationalop() {
		int a=10,b=5;
		System.out.println(a==b); //false
		System.out.println(a!=b); //true
		System.out.println(a>=b); //true
		System.out.println(a<=b); //false
	}
	
	void bitwiseAndLogical() {
		int a=10,b=5,c=20;
		System.out.println(a<b && a++<c); //false
		System.out.println(a); //10
		System.out.println(a<b & a++<c); //false
		System.out.println(a); //11
	}
	
	void ternaryop() {
		System.out.println("Inside ternary operator");
		
		int a=2,b=5;
		int min= (a>b)?b:a; //2
		System.out.println(min);  //2
		System.out.println("\n");
	}
	
	void assignop() {
		System.out.println("Inside Assignment Operator");
		
		int a=10,b=20;
		a+=4;
		b-=4;
		System.out.println(a); //14
		System.out.println(b); //16
		
		b>>>=2;
		System.out.println(b);
	}
}
