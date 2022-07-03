package Assignment_02;
class A3 extends Thread{
	public void run() {
		for(int i = 0;i<3;i++) {
		System.out.println("Ping");
		System.out.println("Ping");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		}
	}
}
	
class A4 extends Thread{
	public void run() {
		for(int i = 0;i<3;i++) {
		System.out.println("Pong");
		System.out.println("Pong");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		
	}
	}
}

public class Q23 {
	public static void main(String[] args) throws InterruptedException {
		A3 obj = new A3();
		A4 ob = new A4();
		
		obj.start();
		Thread.sleep(100);
		ob.start();
	}
}
