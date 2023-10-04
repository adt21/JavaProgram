package lambdaExpression;

interface B{
	void show(int i);
}
public class Lambda {

	public static void main(String[] args) {
		
		B obj;
		
		//lambda expression start
		
		obj = (i) -> //as you pass int i inside show() method in interface B that's why you need to write it here 
		{
			System.out.println("Hello " + i);
		};
		//also you can write in this way
		// "obj = () -> System.out.println("Hello");" as this a single line statement
		
		obj.show(9);
	}

}
