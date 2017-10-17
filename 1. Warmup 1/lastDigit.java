/******************************************************************

  Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

  lastDigit(7, 17) → true
  lastDigit(6, 17) → false
  lastDigit(3, 113) → true

*******************************************************************/

import java.util.Scanner;
public class lastDigit {
  public static boolean lastDigit(int a, int b) {
    return (a%10 == b%10);
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % 'mod' operator computes remainders, so 17 % 10 is 7.");
    System.out.println("");
    System.out.println("Enter 2 integer values.");
    int x = input.nextInt();
    int y = input.nextInt();

    System.out.println(lastDigit(x, y));
  }
}
