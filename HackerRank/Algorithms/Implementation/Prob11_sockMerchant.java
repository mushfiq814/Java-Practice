import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int sockMerchant(int n, int[] ar) {
        // Complete this function
        int count=1;
        int evenCount=0;
        ar = sortFunction(n, ar);
        for (int i=0; i<n-1; i++) {
            if (ar[i]==ar[i+1]) {
                count++;
                if (count%2==0) evenCount++;
            }
            else count=1;
        }
        return evenCount;
    }

    static int[] sortFunction(int n, int[] ar) {
        int temp=0;
        for (int i=0; i<n; i++) {
            for (int j=i+1; j<n; j++) {
                if (ar[i]>ar[j]) {
                    temp=ar[i];
                    ar[i]=ar[j];
                    ar[j]=temp;
                }
            }
        }
        return ar;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
