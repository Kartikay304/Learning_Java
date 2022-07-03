package Assignment_02;

class A1 extends Thread{
	public void run() {
		for(int i = 0;i<3;i++) {
		System.out.println("Ping");
		
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		}
	}
}
	
class A2 extends Thread{
	public void run() {
		for(int i = 0;i<3;i++) {
		System.out.println("Pong");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {}
		
	}
	}
}
public class Q22 {
	
	public static void main(String[] args) throws InterruptedException {
	A1 obj = new A1();
	A2 ob = new A2();
	
	obj.start();
	Thread.sleep(100);
	ob.start();
}
}
