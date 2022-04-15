package unit_01;

public class P4_Task01_ControlAndConditionalStatementsInJava {

	public static void main(String[] args) {
		Statements obj=new Statements();
		
		obj.DecisionMakingStatements();
		obj.LoopStatements();
		obj.JumpStatements();
	}
}

class Statements {
	
	void DecisionMakingStatements() {
		int x=10;
		int y=12;
		if(x+y<10) {
			System.out.println("x+y is less than 10");
		}
		else {
			System.out.println("x+y is greater than 10");
		}
		int num=2;
		
		switch(num) {
		case 0:
			System.out.println("Number is 0");
			break;
		case 1:
			System.out.println("Number is 1");
			break;
		default:
			System.out.println(num);
		}
	}
	
	void LoopStatements() {
		int sum=0;
		for(int i=0;i<=10;i++) sum+=i;
		System.out.println("The sum of first n natural number is"+sum);
		
		String[] names= {"Java","C","Python","Javascript","R"};
		System.out.println("Printing the contents of array names:\n");
		
		for(String name:names) System.out.println(name);
		
		int i=0;
		System.out.println("Printing the list of first 10 even numbers");
		while(i<10) {
			System.out.println(i);
			i+=2;
		}
		i=0;
		System.out.println("Printing the list of forst 10 even numbers\n");
		do {
			System.out.println(i);
			i+=2;
		}while(i<=10);
	}
	
	void JumpStatements() {
		for(int i=0;i<=10;i++) {
			if(i==6)break;
			System.out.println(i);
		}
	}
}
