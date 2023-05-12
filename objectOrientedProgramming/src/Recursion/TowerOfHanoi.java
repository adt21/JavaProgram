package Recursion;

public class TowerOfHanoi {
	public static void towerHanoi(int n, char s, char h, char d) {
		if(n == 0) {
			return;
		}
		else if(n == 1) { //base case
			System.out.println("Move 1st disk from " + s + " to " + d);
			return;
		}
		towerHanoi(n-1, s, d, h); // n-1 disk move source to helper
		System.out.println("Move " + n + "th disk from " + s + " to " + d);//nth disk move from source to destination
		towerHanoi(n-1, h, s, d); // n-1 disk which is already in helper will move into destination
	}

	public static void main(String[] args) {
		towerHanoi(4, 's', 'h', 'd');
	}

}
