package Recursion;

public class MergeSort {
	 public static void merge(int[]s1,int[]s2,int[]d){
	        int i=0;
	        int j=0;
	        int k=0;
	        while(i<s1.length && j<s2.length){
	            if(s1[i]<=s2[j]){
	                d[k]=s1[i];
	                i++;
	                k++;
	            }else{
	                d[k]=s2[j];
	                k++;
	                j++;
	            }
	        }
	        if(i<s1.length){
	            while(i<s1.length){
	                d[k]=s1[i];
	                i++;
	                k++;
	            }
	        }
	        if(j<s2.length){
	            while(j<s2.length){
	                d[k]=s2[j];
	                k++;
	                j++;
	            }
	        }
	    }
	public static void mergeSort(int a[]) {
		if(a.length <= 1) {
			return;
		}
		int b[] = new int[a.length/2]; // length of b = 4(0 to 3)
		int c[] = new int[a.length - b.length]; // length of c = 5(4 to 8)
		for(int i = 0; i < a.length/2; i++) {
			b[i] = a[i];
		}
		for(int i = a.length/2; i < a.length; i++) {
			c[i - a.length/2] = a[i]; // here we write [i-a.length/2] as at 0th index element will
			//be stored in array C so a.length/2 = 4 and i = 4 so [i-a.length/2] = 0
		}
		mergeSort(b);
		mergeSort(c);
		merge(b,c,a);	
	}
	public static void main(String[] args) {
		int a[] = {10,4,5,9,8,6,12,11,7}; //a.length = 9, so a.length/2 = 4 and remaining = (9-4 = 5)
		mergeSort(a);
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
