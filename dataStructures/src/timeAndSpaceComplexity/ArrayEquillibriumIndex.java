package timeAndSpaceComplexity;

public class ArrayEquillibriumIndex {
	public static int equillibriumIndex(int[] arr) {
		int leftSum = 0, rightSum = 0;
		for(int i = 0; i < arr.length; i++) {
			rightSum += arr[i]; // 22
		}
		for(int i = 0; i < arr.length; i++) {
			rightSum -= arr[i]; // 21,18,14,12,10
			if(leftSum == rightSum) { //10 == 10, index = 4(ans)
				return i;
			}
			leftSum += arr[i]; //0(initially),1,4,8,10
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {1,3,4,2,2,5,4,1};
		int r = equillibriumIndex(arr);
		System.out.println(r);

	}

}
