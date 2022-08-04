package Join_Method;

public class ThreadName extends Thread{

	@Override
	public void run() {
		for(int i=0; i <=10; i++) {
			System.out.println("This is ThreadName thread"+getName()+"Priority thread: "+getPriority());
		}
		
		
	}

	public void start() {
		System.out.println("Method started");
		
	}

}
