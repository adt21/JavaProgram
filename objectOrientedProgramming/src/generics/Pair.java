package generics;
// if structures two classes are same except just type of variable is different(like integer or double or string..etc)
//then we can use this generic statement by writing this type of syntax (angular bracket<T(or any other word)>)
//we can achieve this by writing a single class code
public class Pair<T> {
	private T first;
	private T second;
	
	public Pair() {}; // default constructor
	
	public Pair(T first, T second) {
		this.first = first;
		this.second = second;
	}
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public T getSecond() {
		return second;
	}
	public void setSecond(T second) {
		this.second = second;
	}
}
