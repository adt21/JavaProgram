package gfg;

import java.util.ArrayList;

public class RotateBit {
	//n = given decimal number, d = no of bits we have to rotate, t = integer n is stored using 16 bits
	public static ArrayList<Integer> rotation(int n, int d, int t){
		
		ArrayList<Integer> a = new ArrayList<>();
		int l = ((n >> d) | (n << (t-d))) & 0xFFFF;
		int r = ((n << d) | (n >> (t-d))) & 0xFFFF;
		a.add(l);
		a.add(r);
		return a;
		
	}

	public static void main(String[] args) {
		int n = 2;
		int d = 1;
		int t = 16;
		ArrayList<Integer> r = rotation(n, d, t);
		for(int i = 0; i < r.size(); i++) {
			System.out.print(r.get(i) + " ");
		}
	}

}
