package Join_Method;

public class ThreadDemo {

	public static void main(String[] args) {
		
		RunnableDemo r = new RunnableDemo();
//		Thread t = new Thread();
//		t.setDaemon(true);
//		t.start();
//		System.out.println(t.isDaemon());
		
		ThreadName n = new ThreadName();
		n.setName("Thread1");
		
		ThreadName n1 = new ThreadName();
		n1.setName("Thread2");
		n.setPriority(9);
		n1.setPriority(10);
		n.start();
		n1.start();

	}

}
