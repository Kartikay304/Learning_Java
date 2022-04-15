package unit_01;

/*
 - It is called when an instance of the class is created
 - At the time of calling the constructor, memory for he object is allocated.
 - It is a special type of memory used to initialize object
 - Every time an object is created using  the new() keyword, at least one constructor is called.
 - There are two types of constructors in java
      = Parameterized constructor
      - Default constructor
 */
public class P5_Task03_ConstructorsInJava {

	public static void main(String[] args) {
		ABC4 obj = new ABC4();
		ABC4 obj1 = new ABC4(7);
		System.out.println(obj.a);
		System.out.println(obj1.a);
//		obj.display();
//		obj1.display();
	}
}

class ABC4 {
	int a;
	
	/*
	 * ClassName(Constructor Parameters) {
	 *    All the class and instance variables can be initialized here!
	 * }
	 */
	
	ABC4() {
		a=10;
	}
	
	ABC4(int a){
		this.a=a;
	}
	
	void display() {
		int b=10;
		System.out.println(a);
		System.out.println(b);
	}
	
	int display2() {
		System.out.println(a);
//		System.out.println(b);
		return a;
	}
}
