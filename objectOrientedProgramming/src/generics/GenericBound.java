package generics;

public class GenericBound {
	public static<T extends PrintInterface> void printArray(T arr[]) {
		for(int i = 0; i < arr.length; i++) {
			arr[i].print();
		}	
	}

	public static void main(String[] args) {
		Vehicle v[] = new Vehicle[5];
		for(int i = 0; i < v.length; i++) {
			v[i] = new Vehicle(10*i, "suzuki") ;
		}
		printArray(v);
		
		Student s[] = new Student[5];
		for(int i = 0; i < s.length; i++) {
			s[i] = new Student(10*i + 1) ;
		}
		printArray(s);
	}

}
