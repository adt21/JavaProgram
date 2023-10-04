package multithreading;

/*This is the second way to create thread using java.lang.runnable
 * You can also see more about on this by clicking right of the Runnable
 * and click open declaration
 */

public class Thread2 implements Runnable { //Runnable interface has on;y one abstract method run()

	@Override
	public void run() {
		
		for(int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread() + " " + i);
		}
		
	}

	

}
