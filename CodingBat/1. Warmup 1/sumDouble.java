/******************************************************************

  Given two int values, return their sum. Unless the two values are the same, then return double their sum.

  sumDouble(1, 2) → 3
  sumDouble(3, 2) → 5
  sumDouble(2, 2) → 8

*******************************************************************/

import java.util.Scanner;
public class sumDouble {
  public static int sumDouble(int a, int b) {
    if (a==b) return 4*a;
    else return a+b;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given two int values, return their sum. Unless the two values are the same, then return double their sum.");
    System.out.println("");
    System.out.println("Enter 2 integer values.");
    int x = input.nextInt();
    int y = input.nextInt();

    System.out.println(sumDouble(x, y));
  }
}
