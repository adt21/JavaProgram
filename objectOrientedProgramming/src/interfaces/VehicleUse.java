package interfaces;

public class VehicleUse {

	public static void main(String[] args) {
		Vehicle v =  new Vehicle();
		//VehicleInterface vi = new VehicleInterface(); you can't do this as interface is super abstract and an abstract class can't create an object
		VehicleInterface vi; // but you create references here
		//vi = new Vehicle(); // using abstract class you can create polymorphism
		//vi.getCompany();

	}

}
