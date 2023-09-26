package Oops;

public class MethodOverloading {
	
	public static void getInfo(int val) {
		System.out.println("Integer");
	}
	public static void getInfo(long val) {
		System.out.println("Long");
	}

	public static void main(String[] args) {
		getInfo(2);

	}

}
