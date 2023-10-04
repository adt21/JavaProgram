package multithreading;

//This is the 1st way to create Thread using java.lang.Thread

// in thread everything is written inside run method

public class Thread1 extends Thread {
	
	public Thread1(String threadName) {
		super(threadName);
	}

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Inside " + Thread.currentThread() + " " + i);
			//Thread.CurrentThread() return the current Thread details
		}
	}
	
	
}
