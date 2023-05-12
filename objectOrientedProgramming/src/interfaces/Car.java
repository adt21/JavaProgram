package interfaces;

public class Car extends Vehicle implements VehicleInterface, CarInterface {

	@Override
	public boolean isMotorized() {
		return true;
	}

	@Override
	public String getCompany() {
		return null;
	}

	@Override
	public int numGeers() {
		// TODO Auto-generated method stub
		return 0;
	}

}
