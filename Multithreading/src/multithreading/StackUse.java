package multithreading;

public class StackUse {

	public static void main(String[] args) {
		System.out.println("main is starting");
		Stack s = new Stack(5);
		
		/*Here we create Thread using java.lang.Runnable
		/and here two threads run Parallelly one thread is doing push operation and 
		 * another one is doing pop operation at a same time
		 */
		new Thread(() -> {
			int counter = 0;
			while(++counter < 10) {
				System.out.println("Push" + s.push(100));
			}
		},"Pusher").start();
		
		new Thread(() -> {
			int counter = 0;
			while(++counter < 10) {
				System.out.println("Push" + s.pop());
			}
		},"Popper").start();
	}

}
