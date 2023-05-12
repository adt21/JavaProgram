package polymorphism;

public class Maruti extends Vehicle2 {
	int numDoors;
	
	public Maruti() {
		System.out.println("Hello Maruti");
	}
	public void print() {
		super.print();
		System.out.println("Maruti" + " numdoors " + numDoors);
	}

}
