package inheritence;
// Car is child of parent Vehicle
public class Car extends Vehicle {
	/* extends Vehicle means here we specify that Car has all property of Vehicle class as well as it will 
	 * extend it's own property(not common property of parent's property - Vehicle)
	 */	
	int numDoors;
	
	public Car(){
		System.out.println("Car's constructor");
		
	}
	public void print() {
		super.print();
		System.out.println("Car" + " numOfDoors " + numDoors);
	}
	 
}
