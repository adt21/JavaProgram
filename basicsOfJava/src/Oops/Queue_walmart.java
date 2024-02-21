package Oops;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_walmart {

	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i = 1; i <= 5; i++) {
			q.offer(i);
		}
		while(!q.isEmpty()) {
			System.out.print(q.poll() + " ");
		}

	}

}
