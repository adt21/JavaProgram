package Abstract;

public abstract class Vehicle {
	private String color;
	int maxSpeed;
	public Vehicle() {
		color = "black";
		System.out.println("Vehicle's constructor");
	}
	public Vehicle(int maxSpeed) {
		color = "black";
		System.out.println("Vehicle's constructor");
		this.maxSpeed = maxSpeed;
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void print() {
		System.out.println("Vehicle " + " color " + color + " maxSpeed " + maxSpeed);
	}
	public abstract boolean isMotorized();
	public abstract String getCompany();
}
