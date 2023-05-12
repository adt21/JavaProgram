package polymorphism;

public class Vehicle2Use {

	public static void main(String[] args) {
		Vehicle2 v = new Maruti(); // it is polymorphism where base class referring subclass
		
		
//		Maruti m = new Vehicle2(); // here you can't do this viceversa
		//only base class refer subclass
//		Vehicle2 v2 = new Cycle(); we can create this also, this is right statement
		
		v.maxSpeed = 100;
		
//		v.numDoors = 4; //this line is showing error because numdoors is only belong to Maruti class
		//because it's own property as well . Maruti & cycle both are under vehicle but we know
		//cycle can't have number of doors(numDoors) and other side maruti's own property it is
		//that's why it is showing error
		//v.print(); // it is runtime polymorphism
		
		//here we know overriding function is present [print()] which is present in vehicle2 class
		//as well as maruti's class but here print function indicates maruti's print function
		// as base class vehicle2 referring subclass maruti
		
	}

}
