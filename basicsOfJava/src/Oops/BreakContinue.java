package Oops;

public class BreakContinue {

	public static void main(String[] args) {
		// break statement example
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.print(i + "  ");
        }

        // continue statement example
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.print(i + " ");
        }
	}

}
