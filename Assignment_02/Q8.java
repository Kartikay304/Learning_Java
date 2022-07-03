package Assignment_02;


class  counter{
	 int count;
	public synchronized void increment() {
		count=count+10;
	}
	public synchronized void decrement() {
		count=count-10;
	}
}

public class Q8 {
	public static void main(String[] args) throws Exception{
		final counter t1 = new counter();
		
		Thread h = new Thread(new Runnable() 
		{
			public void run() {
			for(int i=0;i<=100;i++) 
				t1.increment();
			}
			
		});
		
		Thread h2 =  new Thread(new Runnable() {
			public void run() {
				for(int i =0;i<=100;i++)
					t1.decrement();
			}
		});
		
		h.start();
		h2.start();
		
		h.join();
		h2.join();

		System.out.println("count: "+t1.count);
	}

}
