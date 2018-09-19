import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Prob8_migratoryBirds {

    static int sortAndMode(int n, int[] ar) {
      // Complete this function
      n = ar.length;
      int count=1;
      int maxCount=1;
      int mode=0;
      Arrays.sort(ar);
      for (int k=0; k<n-1; k++) {
        if (ar[k]==ar[k+1]) {
          count++;
          if (count>maxCount) {
            maxCount=count;
            mode=ar[k];
          }
        }
        else {
          count=1;
        }
      }
      return mode;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = (int) (Math.random()*5)+1;
        }
        int result = sortAndMode(n, ar);
        System.out.println(result);
    }
}
