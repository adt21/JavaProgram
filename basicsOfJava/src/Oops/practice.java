package Oops;

import java.util.Arrays;

//import java.util.Scanner;

public class practice {
	
    public static int[] simulate(int[] entries) {
 
            int[] arr = Arrays.copyOf(entries, entries.length);
          
          for(int i = 0; i < 3; i++){
            if(i + 4 < entries.length && entries[i+4] >= entries[i]) {
               arr[i] = 0;
            }
          }
          
          for(int i = 3; i < entries.length - 4; i++) {
            if(entries[i-3] >= entries[i] || entries[i+4] >= entries[i]){
              arr[i] = 0;
            }
          }
          
          for(int i = entries.length-4; i < entries.length; i++) {
            if(entries[i-3] >= entries[i]) {
              arr[i] = 0;
            }
          }

          return arr;
        }

        public static void main(String[] args) {
            int[] records = { 1, 2, 0, 5, 0, 2, 4, 3, 3, 3 };
            int[] result = simulate(records);
            System.out.println(Arrays.toString(result));
            
        }
    }