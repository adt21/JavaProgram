package stacks;

public class StackUsingQueueUse {

	public static void main(String[] args) throws StackEmptyException {
		StackUsing2Queues<Integer> s = new StackUsing2Queues<>();
		int arr[] = {10,20,30,40};
		
		for(int elem: arr) {
			s.push(elem);
		}
		
		while( ! s.isEmpty()) {
			System.out.println(s.pop());
		}

	}

}
