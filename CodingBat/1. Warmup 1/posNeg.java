/******************************************************************

  Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.

  posNeg(1, -1, false) → true
  posNeg(-1, 1, false) → true
  posNeg(-4, -5, true) → true

*******************************************************************/

import java.util.Scanner;
public class posNeg {
  public static boolean posNeg(int a, int b, boolean negative) {
    if (negative == false) {
      if ((a>0 && b<0) || (a<0 && b>0)) return true;
      else return false;
    }
    else {
      if (a<0 && b<0) return true;
      else return false;
    }
  }


  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given 2 int values, return true if one is negative and one is positive. Except if the parameter 'negative' is true, then return true only if both are negative");
    System.out.println("");
    System.out.println("Enter 2 integers");
    int x = input.nextInt();
    int y = input.nextInt();
    System.out.println("Set parameter 'Negative' to True or False.");
    Boolean z = input.nextBoolean();

    System.out.println(posNeg(x, y, z));
  }
}
