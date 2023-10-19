package on_Campus;

import java.util.Scanner;
public class PrimeConstruction{
  private static int findSmallestNumber(int[] num){
    int min = num[0];
    for(int n: num){
      if(n < min){
        min = n;
      }
    }
    return min;
  }
  private static int findSmallestPrime(int[] numbers, int q){
    int p = q + 1;
    while(true){
      if(isPrime(p) && hasRemainder(p, numbers, q)){
        return p;
      }
    
      return p++;
    }
    }
    private static boolean isPrime(int k){
      if(k <= 1){
        return false;
      }
      for(int i = 2; i < Math.sqrt(k); i++){
        if(k % i == 0){
          return false;
        }
      }
      return true;
    }
    private static boolean hasRemainder(int p, int[] numbers, int q){
      for(int num : numbers){
        if(num != q && num != q){
          return false;
        }
      }
      return true;
    }
    
    public static void main(String[] args){
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int numbers[] = new int[n+1];
      for(int i = 0; i <= n; i++){
        numbers[i] = s.nextInt();
      }
      int q = findSmallestNumber(numbers);
      int p = findSmallestPrime(numbers,q);
      
      if(p > 0){
        System.out.println(p);
      }else{
        System.out.println("None");
      }
    }
}