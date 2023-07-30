package priorityQueues;
/*
 * Priority queue is internally maintain a heap and we store the heap in an array list instead of array
 * because every time we need to increase array size(dynamic array) and each element of the array has two
 * things 1) value(like "map") 2) priority (like 5)
 */
//And here we maintain Min Heap
import java.util.ArrayList;

public class Priority_Queue<T> {
	
	private ArrayList<Element<T>> heap;
	
	public Priority_Queue () {
		heap = new ArrayList<>();
	}
	
	//insert
	public void insert(T value, int priority) {
		Element<T> e= new Element<>(value, priority);
        heap.add(e);
        int childIndex = heap.size()-1;
        int parentIndex = (childIndex-1)/2;

        while(childIndex > 0){
            if(heap.get(childIndex).priority < heap.get(parentIndex).priority){
                Element<T> temp = heap.get(childIndex);
                heap.set(childIndex, heap.get(parentIndex));
                heap.set(parentIndex, temp);
                childIndex= parentIndex;
                parentIndex= (childIndex-1)/2;
            }else{
                return;
            }
        }
	}
	
	//get the minimum value
	public T getMin() throws PriorityQueueException {
		if(isEmpty()) {
			throw new PriorityQueueException();
		}
		return heap.get(0).value;// as root as well as top most element is minimum element and it present at
		// 0th index so that we return it's value(as both priority and value is present there)
	}
	
	//remove
	public T removeMin() throws PriorityQueueException {
		if(isEmpty()) {
			throw new PriorityQueueException();
		}
        Element<T> removed= heap.get(0);
        T ans = removed.value;

        heap.set(0, heap.get(heap.size()-1));
        heap.remove(heap.size()-1);

        int parentIndex=0;
        int leftChildIndex= 2*parentIndex+1;
        int rightChildIndex= 2*parentIndex +2;

        while(leftChildIndex < heap.size()){
            int minIndex= parentIndex;
            if(heap.get(leftChildIndex).priority < heap.get(minIndex).priority){
                minIndex= leftChildIndex;
            }
            if(rightChildIndex < heap.size() && (heap.get(rightChildIndex).priority < heap.get(minIndex).priority)){
                minIndex= rightChildIndex;
            }
            if(minIndex == parentIndex) {
            	break;
            }
            Element<T> temp= heap.get(minIndex);
            heap.set(minIndex, heap.get(parentIndex));
            heap.set(parentIndex, temp);
            parentIndex= minIndex;
            leftChildIndex= 2*parentIndex+1;
            rightChildIndex= 2*parentIndex +2;
        }
        return ans;
	}
	
	//size
	public int size() {
		return heap.size();
	}
	
	public boolean isEmpty() {
		if(size() == 0) {
			return true;
		}
		return false;
		
	}
}
