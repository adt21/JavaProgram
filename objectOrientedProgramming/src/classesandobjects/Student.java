package classesandobjects;

public class Student {
	String name;
	private int rollNumber;
	public static final double CONVERSIONFACTOR = 0.97; //now we can't modify it anywhere
	private static int numStudents;
	public int getRollNumber() {
		return this.rollNumber;
	}
	public Student(String name,int rollNumber) {
		this.name = name;
		this.rollNumber = numStudents++;
	}
	//getter
	public static int getnumSttudents() {
		return numStudents;
	}
	
	public void setRollNumber(int rollNumber) {
		if(rollNumber <= 0) {
			return;
		}
		System.out.println("reference of this keyword is same as current object" + this);
		this.rollNumber = rollNumber; // this actually reference of current object
	}
	
}
