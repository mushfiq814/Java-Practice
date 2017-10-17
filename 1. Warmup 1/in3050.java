/******************************************************************

  Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.

  in3050(30, 31) → true
  in3050(30, 41) → false
  in3050(40, 50) → true

*******************************************************************/

import java.util.Scanner;
public class in3050 {
  public static boolean in3050(int a, int b) {
    return ( (a>=30 && a<=40 && b>=30 && b<=40) || (a>=40 && a<=50 && b>=40 && b<=50) );
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range 40..50 inclusive.");
    System.out.println("");
    System.out.println("Enter 2 integer values.");
    int x = input.nextInt();
    int y = input.nextInt();

    System.out.println(in3050(x, y));
  }
}
