package Oops;

public class MyClass {
private static int count = 0;

public MyClass() {
count++;
}

public static int getCount() {
return count;
}

public static void main(String[] args) {
MyClass obj1 = new MyClass();
MyClass obj2 = new MyClass();
MyClass obj3 = new MyClass();

System.out.println(MyClass.getCount());
}
}

