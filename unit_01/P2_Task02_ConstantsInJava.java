package unit_01;

public class P2_Task02_ConstantsInJava {
	private static final double pi=3.14;

	public static void main(String[] args) {
		final int a=10;
		
		System.out.println(pi);
		System.out.println(a);
		
		add(1,2);
		multi(1,2);
		
		calculate obj=new calculate();
		System.out.println(obj.add(1,2));
		System.out.println(obj.a);
	}

	static int add(int a,int b) {
		System.out.println(a);
		System.out.println(pi);
		
		return (a*b);
	}

	static int multi(int a,int b) {
		return (a*b);
	}
}

class calculate {
	int a=10;
	
	int add(int a,int b) {
		return(a+b);
	}
	
	int multi(int a,int b) {
		return(a*b);
	}
}
