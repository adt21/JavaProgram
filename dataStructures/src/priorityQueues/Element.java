package priorityQueues;

//as each array element has two things 1) value 2) priority ,,that's why we create this class

public class Element<T> {

	T value; // value can be any type like string or integer
	int priority;
	
	public Element(T value, int priority) {
		this.value = value;
		this.priority = priority;
	}
}
