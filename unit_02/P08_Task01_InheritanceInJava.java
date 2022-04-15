package unit_02;

/*
 * 
 - extends keyword
 
 - SubClass
 - SuperClass
 - "Code Re-usability"
 
 Class derived-class-name "extends" base-class {
       //methods and false
 }
 
 Types of inheritance:
 - Single Inheritance
 - Multilevel Inheritance
 - "Multiple Inheritances::" Java does not support ,multiple inheritance with classes
   - It handles this feature by implementing more than one interface instead of extending
     more than one class
     
 - Hierarchical Inheritance(Tree?)?: Yes!
 
 - HYbrid Inheritance? No!
 
 - constructor Calls flow in Inheritance!
   - Default constructor
   - Parameterized constructor
   
 * constructor is called when object is created. Constructors are not inherited, but we can access them by using super() keyword.
 * The super keyword in java is a reference variable that is used to refer parent class objects.
 */

public class P08_Task01_InheritanceInJava {

	public static void main(String[] args) {
		Three g = new Three();
		g.methodOne();
		g.methodTwo();
		g.methodOne();
		g.methodThree();
		
		Two two = new Two(1);
		D obj = new D(2);
		obj.methodFour();
	}
}

class One {
	int a;
	One(int x) {
		System.out.println("One Constructor!");
	}
	
	public void methodOne() {
		System.out.println("FirstMethod!");
	}
}

class Two extends One {
	int b;
	
	Two(int x) {
		super(3);
		b=x;
		System.out.println("Two");
	}
	
	public void methodTwo() {
		System.out.println("SecondMethod");
	}
}

class Three extends Two {
	int c;
	 Three() {
		 super(1);
		 System.out.println("Three Constructor!");
	 }
	 Three(int x) {
		 super(1);
		 c=x;
		 System.out.println("Three");
	 }
	 public void methodThree() {
		 System.out.println("SecondMethod");
	 }
}

class A {
	int a;
	
	A(int a1) {
		a=a1;
	}
	public void methodOne() {
		System.out.println(a);
	}
}

class B extends A {
	int b;
	
	B(int x) {
		super(10);
		b=x;
	}
	
	public void methodTwo() {
		System.out.println(b);
	}
}

class C extends A {
	int c;
	
	C() {
		super(10);
		c =10;
	}
	public void methodThree() {
		System.out.println(c);
	}
}

class D extends A {
	int d;
	 D(int d1) {
		 super(d1);
		 d=d1;
	 }
	 public void methodFour() {
		 System.out.println(d);
	 }
}
