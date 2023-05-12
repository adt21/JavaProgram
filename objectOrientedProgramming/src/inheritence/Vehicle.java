package inheritence;

public class Vehicle { // Vehicle is parent of Car and Bicycle
	private String color;
	protected int maxSpeed;
	
	public Vehicle() {
		System.out.println("Vehicle's constructor");
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void print() {
		System.out.println("Vehicle" + " color " + color + " Maxspeed " + maxSpeed);
	}
	  
}
