/******************************************************************

  Given 2 int values, return true if either of them is in the range 10..20 inclusive.

  in1020(12, 99) → true
  in1020(21, 12) → true
  in1020(8, 99) → false

*******************************************************************/

import java.util.Scanner;
public class in1020 {
  public static boolean in1020(int a, int b) {
    return ( (a>=10 && a<=20) || (b>=10 && b<=20) );
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given 2 int values, return true if either of them is in the range 10..20 inclusive.");
    System.out.println("");
    System.out.println("Enter 2 integers.");
    int x = input.nextInt();
    int y = input.nextInt();

    System.out.println(in1020(x, y));
  }
}
