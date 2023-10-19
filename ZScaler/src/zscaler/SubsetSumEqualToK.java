package zscaler;

//import java.util.ArrayList;

public class SubsetSumEqualToK {
	
	public static boolean subsetSumToK(int n, int k, int arr[]) {
		if(k == 0){
            return true;
        }
        if(n == 0){
            return false;
        }

        if(arr[n-1] > k){
            return subsetSumToK(n-1,k,arr);
        }
        return subsetSumToK(n-1,k,arr) || subsetSumToK(n-1,k - arr[n-1],arr);
    }

	public static void main(String[] args) {
		
		int arr[] = {4,7,5,8,3,2};
		int n = arr.length;
		int k = 9;
		boolean b = subsetSumToK(n, k, arr);
		System.out.println(b);
	}

}

/* ****Another approach*****
 * boolean dp[][] = new boolean[k+1][n+1];
        for(int i = 0; i <= n; i++){
            dp[0][i] = true;
        }
        for(int i = 1; i <= k; i++){
            dp[i][0] = false;
        }

        for(int i = 1; i <= k; i++){
            for(int j = 1; j <= n; j++){
                dp[i][j] = dp[i][j-1];
                if(i >= arr[j-1]){
                    dp[i][j] = dp[i][j] || dp[i - arr[j-1]][j-1];
                }
            }
        }
        return dp[k][n];
 */
