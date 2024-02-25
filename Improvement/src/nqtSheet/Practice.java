package nqtSheet;

import java.util.Arrays;

public class Practice {
	
	public static int[] getSecondOrderElements(int n, int []a) {
        Arrays.sort(a);
        return new int[] {a[1], a[a.length - 2]};
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
