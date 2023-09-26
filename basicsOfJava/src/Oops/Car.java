package Oops;

public class Car extends Vehicle {
	
	int numDoors;
	
	public Car() {
		System.out.println("car");
	}
	public Car(int numDoors) {
		this.numDoors = numDoors;
	}
	
//	public void print() {
//		super.print();
//		System.out.println("NumDorrs " + numDoors);
//	}
}
