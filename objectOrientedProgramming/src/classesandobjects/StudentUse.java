package classesandobjects;
import java.util.Scanner;
public class StudentUse {
	
	public static void main(String[] args) {
//Scanner s = new Scanner(System.in);// Scanner is a class and s is an object and new means it creates object's memory
		//similarly we can create class
		Student s1 = new Student("Aditi", 5);
		Student s2 = new Student("Manisha", 9);
//		Student.numStudents = 100;
//		System.out.println(Student.getnumSttudents);
		System.out.println(s1.getnumSttudents());
		System.out.println(s1);
		s1.name = "Aditi";
		s1.setRollNumber(10);
//		s1.rollNumber = 5; // as rollNumber is private
//		s2.name = "Abhi";
		System.out.println(s1.name +" " + s1.getRollNumber());
		
	}

}
