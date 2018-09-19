/******************************************************************

  Given an int n, return true if it is within 10 of 100 or 200.
  Note: Math.abs(num) computes the absolute value of a number.

  nearHundred(93) → true
  nearHundred(90) → true
  nearHundred(89) → false

*******************************************************************/
import java.util.Scanner;
public class nearHundred {
  public static boolean nearHundred(int n) {
    return ( Math.abs(n-100) <= 10 || Math.abs(n-200) <= 10 );
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given an int n, return true if it is within 10 of 100 or 200.");

    System.out.println("Enter an int: ");
    int n = input.nextInt();

    System.out.println(nearHundred(n));
  }
}
