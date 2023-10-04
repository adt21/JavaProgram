package multithreading;

public class ThreadTester {

	public static void main(String[] args) {
		System.out.println("main thread is starting"); //main thread content
		
		Thread thread1 = new Thread1("child thread"); //child thread that spawned from main thread
//		thread1.setDaemon(true);
		thread1.start();
		
		//here you have to pass the instance of the runnable interface inside Thread class
		Thread thread2 = new Thread(new Thread2());
		thread2.start();
		
		System.out.println("main thread is exiting");
		//order of  the main thread and it's child (user) thread or anything order can be happened. it's Up to JVM
		
	
	}

}
