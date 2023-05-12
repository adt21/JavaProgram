package Recursion;

public class NaturalNoPrint {
	public static void printNaturalNo(int n) {
		if(n == 0) {
			return; // if no = 0 then it do nothing
		}
		//at 1st 10 != 0 then it calls 9 then 9 call 8 then ..continue
		printNaturalNo(n - 1); // 10 call 9 then 8 - 7 - 6 - 5 ...till 0
		System.out.println(n); // 0 return nothing then 1 print then 2 ...10
	}

	public static void main(String[] args) {
		printNaturalNo(10);
	}

}
