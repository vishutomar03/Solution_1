
import java.util.*;
import java.lang.*;
import java.io.*;

class Solution{
		public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int t = scan.nextInt();
            for (int k = 1; k <= t; k++) {
                int n = scan.nextInt();
                int[] array = new int[n];
                for (int i = 0; i < n; i++) {
                    array[i] = scan.nextInt();
                }

                int value = findMax(array, n);
                System.out.println(value);
            }
        }

        public static int findMax(int[] arr, int n) {
            int max= Integer.MIN_VALUE;
            int count=0;
            for(int i=0; i<n-1; i++){
                for(int j=i+1; j<n;j++){
                    if((arr[i] + arr [j])> max){
                        max= arr[i] + arr [j];
                    }
                }
            }
            for(int i=0; i<n-1; i++){
                for(int j=i+1; j<n;j++){
                    if((arr[i] + arr [j])== max){
                        count+=1;
                    }
                }
            }
            return count;
	    }
    }