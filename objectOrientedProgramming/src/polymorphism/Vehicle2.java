package polymorphism;

public class Vehicle2 {
	private String color;
	protected int maxSpeed;
	
	public Vehicle2() {
		System.out.println("Welcome to use Vehicle2");
	}
	public String getColor() {
		return color;
	}
	public void setColor(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void print() {
		System.out.println("Vehicle2 " + "color " + color + " maxspeed " + maxSpeed);
	}
	

}
