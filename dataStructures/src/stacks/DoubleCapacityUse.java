package stacks;

public class DoubleCapacityUse {

	public static void main(String[] args) throws StackEmptyException {
		StackDoubleCapacity stack = new StackDoubleCapacity();
		int arr[] = {5,6,7,1,4,9};
		 
		for(int i = 0; i < arr.length; i++) {
			stack.push(arr[i]);
		}
		while(! stack.isEmpty()) {
			System.out.println(stack.pop());
		}
//		stack.push(10);
//		System.out.println(stack.size());
//		System.out.println(stack.top());
//		System.out.println(stack.isEmpty());

	}

}

//here in console after run we can see that two "Double capacity" is printed because we initialize 
//the data size as 2 in the StackDoubleCapacity class that's why after printing 5 and 6 it will print double capacity
//at line no 33 in StackDoubleCapacity class , then it will increase it's size that is 2 * previous size of the array
//then size will be now 4 , after printing 7 and 1 (now total element 4 --> 5,6,7,1) then again doubleCapacity()
//function will call and again print "Double capacity" statement and then again increase it's size that is 
//2 * previous size = 8
