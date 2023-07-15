package hashMapImplementation;

import java.util.ArrayList;

public class InsertSearchDeleteRehashing<K, V> {
	ArrayList<MapNode<K, V>> buckets;
	
	int count; 
	int numBuckets;
	
	public InsertSearchDeleteRehashing() { // constructor		
		buckets = new ArrayList<>();
		numBuckets = 5;
		for(int i = 0; i < numBuckets; i++) {
			buckets.add(null);
		}
	}
	//insert operation
	
	private int getBucketIndex(K key) {
		int hc = key.hashCode();
		/*
		 * // here h c means hash code and here it collect it from object as we know every class inherit
		 *  from the object class so it has object's hash code and you can also create your own hashcode 
		 */
		int index = hc % numBuckets;
		return index;
	}
	
	//
	private void reHash() { // this is our internal method not public
		ArrayList<MapNode<K, V>> temp = buckets; // store the reference of old array list inside new list
		buckets = new ArrayList<>();
		for(int i = 0; i < 2 * numBuckets; i++) {
			buckets.add(null);
		}
		count = 0; //because all the element will be insert into the new bucket again
		numBuckets = numBuckets*2;
		//on the old bucket we will go each element in the linked list 
		for(int i = 0; i < temp.size(); i++) {
			//each element of the list in linked list and linked list has head 
			MapNode<K, V> head = temp.get(i);
			while(head != null) {
				//as we stored each of the element of the old array's linked list
				K key = head.key;
				V value = head.value;
				insert(key, value);
				head = head.next;
			}
		}
		
	}
	public void insert(K key, V value) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex); // head of the linked list is that particular index
		//if the node with same key is already present in the linked list, if present just update the value
		
		while(head != null) {
			if(head.key.equals(key)) { // here .equals(key) is used as if key is a string then if you write like this (==) then it will compare between two address not the actual value that's why we write here this method such that actual values will compared
				
				head.value = value;
				return;
			}
			head = head.next;
		}
		//for inserting new node if same element is not there and insert 0th position of the linked list
		head = buckets.get(bucketIndex);
		MapNode<K, V> newNode = new MapNode<>(key, value);
		/*
		 * After inserting new key-value pair into the same index we have to make the new node as a head node
		 * and make a connection between new head node and it's next node(previous node)
		 */
		newNode.next = head;
		buckets.set(bucketIndex, newNode);
		count++;
		double loadFactor = (1.0*count)/numBuckets; //here we do 1.0 multiplication with count as load factor (n/b) < 0,7 ,,so we need decimal value not integer that's why we do it 
		if(loadFactor > 0.7) {
			reHash();
		}	
	}
	
	//load factor
	
	public double loadFactor() {
		return (1.0*count)/numBuckets;
	}
	
	//size
	public int size() {
		return count;
	}
	
	//get value
	public V getValue(K key) {
		int bucketIndex = getBucketIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		
		while(head != null) {
			if(head.key.equals(key)) { 
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	
	//remove operation
	
	public V removeKey(K key) { //whatever key you are removing , you will get the value of the key
		int bucketIndex = getBucketIndex(key);
		MapNode<K, V> head = buckets.get(bucketIndex);
		MapNode<K, V> prev = null; //initially previous will be null
		while(head != null) {
			if(head.key.equals(key)) { 
				if(prev != null) {
					prev.next = head.next;
				}else { //if the 1st node is the removing node which you want to delete
					buckets.set(bucketIndex, head.next);
				}
			count--;
			return head.value;
		  }	
			prev = head;
			head = head.next;
		}
		return null;
	}
}
