package Oops;

public class Vehicle {
	
	private String color;
	protected int maxSpeed;
	
	
	public Vehicle() {
		System.out.println("Vehicle's Constructor");
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	public void print() {
		System.out.println("color " + getColor() + " maxspeed " + maxSpeed);
	}

}
