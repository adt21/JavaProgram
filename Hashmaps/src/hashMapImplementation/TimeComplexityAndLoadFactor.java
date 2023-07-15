package hashMapImplementation;

// here I am discussing about time complexity of insert, delete and searching element

/*
 * For Inserting:---
 * 1) calculating the hash code
 * 2) traversing the linked List
 *for traversing element worst case complexity O(n)
 *for average case , it is said that if the total n number of entries(the factor using which we calculate time)
 *and bucket size is b then you can say at any particular index if you want to insert a new element in that
 *index then linked list will have eventually n/b element. so average case time complexity insertion
 *will happen in O(n/b) time complexity.
 *##### This n/b is called Load factor ####### n/b < 0.7 ,,this 0.7 is called load factor
 * 
 */
