package Oops;

public class VehicleUse {

	public static void main(String[] args) {
		
		Vehicle v = new Vehicle();
		Car c = new Car();
		Bicycle b = new Bicycle(2);
		
		v.maxSpeed = 110;
		v.setColor("white");
		v.getColor();
		
		c.maxSpeed = 10;
		c.setColor("Black");
		c.getColor();
		c.numDoors = 4;
		
		b.maxSpeed = 30;
		b.setColor("gray");
		b.getColor();
		b.wheel = 3;
		
		c.print();

	}

}
/*
 * Here 3 times "Vehicle's Constructor" is printed because when you initialize Vehicle's object then
 * it will print it's default constructor then when you created Car's object then implicitly 1st printed 
 * it's super/ parent class's constructor and then printed car's own constructor , similarly when you create
 *  bicycle object then Inside the BiCycle constructor,
 *   there is an implicit call to the default constructor of the parent class Vehicle that's why it printed
 *   third "Vehicle's Constructor" then print() method.
 * 
 */
