/******************************************************************

  Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

  makes10(9, 10) → true
  makes10(9, 9) → false
  makes10(1, 9) → true

*******************************************************************/

import java.util.Scanner;
public class makes10 {
  public static boolean makes10(int a, int b) {
    return (a+b==10 || (a==10) || (b==10));
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.");
    System.out.println("");
    System.out.println("Enter 2 integer values.");
    int x = input.nextInt();
    int y = input.nextInt();

    System.out.println(makes10(x, y));
  }
}
