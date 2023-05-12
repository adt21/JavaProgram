package classesandobjects;

public class Constructors { // Constructors is just a class name
	String name;
	private int rollNumber;
	public Constructors(String s, int n) { // Constructors is a constructors name which is same as class name
		name = s;
		rollNumber = n;
	}
	public void print() {
		System.out.println(name + " " + rollNumber);
	}

}
