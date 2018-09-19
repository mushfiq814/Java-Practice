/******************************************************************

Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)

sumLimit(2, 3) → 5
sumLimit(8, 3) → 8
sumLimit(8, 1) → 9

*******************************************************************/

import java.util.Scanner;
public class sumLimit {
  public static int sumLimit(int a, int b) {
    int res=0;
    String astr = String.valueOf(a);
    int x = astr.length();
    String sumstr = String.valueOf(a+b);
    int y = sumstr.length();
    if (y>x) res=a;
    else res=a+b;
    return res;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a. If the sum has more digits than a, just return a without b. (Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n) and then check the length of the string.)");
    System.out.println("");
    System.out.println("Enter two ints: ");
    int a = input.nextInt();
    int b = input.nextInt();

    System.out.println(sumLimit(a, b));
  }
}
