package hashMapImplementation;

import java.util.ArrayList;

/*
 * HashMap has key, value as well as bucket array whereas every element of the array contain a linked list
 * and every node of the linked list contains the key value pair in it 
 * As we can use any type of of key and value but we an array cann't be a generic array that's why here 
 * we will use arrayList of node<key, value> that should be a generic. And ArrayList will be in a range
 * And initially put all the value of array list is null. 
 * so that we can insert the value as per our requirement index. 
 */

public class Map<K, V> {
	
	ArrayList<MapNode<K, V>> buckets;
	
	int count; // how many elements present in my HashMap
	int numBuckets; //size of the bucket 
	
	public Map() {
		//as we said by default bucket will be null
		
		buckets = new ArrayList<>();
		numBuckets = 20;
		for(int i = 0; i < numBuckets; i++) {
			buckets.add(null);
		}
	}
}
