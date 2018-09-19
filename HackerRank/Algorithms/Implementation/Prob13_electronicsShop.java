import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

  /*
   * Complete the getMoneySpent function below.
   */
  static int getMoneySpent(int[] keyboards, int[] drives, int b) {
    /*
     * Write your code here.
     */
    int tempTotal=0; 
    int total=0;
    for (int kIndex=0; kIndex<keyboards.length; kIndex++) {
      for (int dIndex=0; dIndex<drives.length; dIndex++) {
        tempTotal=keyboards[kIndex]+drives[dIndex];
        if (tempTotal<=b && tempTotal>total) total=tempTotal;
      }
    }
    if (total==0) total=-1;
    return total;

  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    String[] bnm = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

    int b = Integer.parseInt(bnm[0]);

    int n = Integer.parseInt(bnm[1]);

    int m = Integer.parseInt(bnm[2]);

    int[] keyboards = new int[n];

    String[] keyboardsItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

    for (int keyboardsItr = 0; keyboardsItr < n; keyboardsItr++) {
      int keyboardsItem = Integer.parseInt(keyboardsItems[keyboardsItr]);
      keyboards[keyboardsItr] = keyboardsItem;
    }

    int[] drives = new int[m];

    String[] drivesItems = scanner.nextLine().split(" ");
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

    for (int drivesItr = 0; drivesItr < m; drivesItr++) {
      int drivesItem = Integer.parseInt(drivesItems[drivesItr]);
      drives[drivesItr] = drivesItem;
    }

    /*
      * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
      */

    int moneySpent = getMoneySpent(keyboards, drives, b);

    bufferedWriter.write(String.valueOf(moneySpent));
    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
  }
}
