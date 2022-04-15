package unit_02;

/*
 Abstract Class:
 - An abstract class must be declared with an abstract keyword.
 
 - Abstraction is a process of hiding the implementation details
   and showing only functionality (function declarations) to the user.
 - Can not make object of abstract class directly, but through derived class [can not be instantiated]
 
 - Example of abstract method ?
 - Abstract Class may contain abstract and non-abstract methods
 - (0-100%) abstract methods can be there!
 
 - in case of Interface: 100% abstract methods should be there!
 
 Final Class:
 - The main purpose of using a class being declared as final is to prevent the class from being subclassed.
   - If a class is marked as final then no class can inherit any feature from the final class.
   - You cannot extend a final class. If toy try it gives you a compile time error.
   
 * It is mandatory to override  abstract methods in derived classes. If you only want to override a few of 
    the methods from abstract class, then change the rest of the abstract methods to virtual. 
 */

abstract class Bike {
	int a;
	Bike() {
		System.out.println("Inside Bike Constructor: " +a+"\n");
	}
	
	abstract void run(); //abstract method! (0-100%)
	
	void display() {
		System.out.println("This is display method!");
	}
}

class Honda4 extends Bike {

	@Override
	void run() {
		System.out.println("This is run method!");
	}
}

public class P09_Task01_AbstractAndFinalClassesInJava {

	public static void main(String[] args) {
		Bike obj = new Honda4();
		obj.run();
		obj.display();
		// can not be instantiated
		// Bike obj2 = new Bike();
	}
}

// Final Class
final class Super {
	public int data =30;
	
	void display() {
		System.out.println(data);
	}
}

/* Public class Sub extends Super {
      void display2() {
           display();
      }
  }
*/