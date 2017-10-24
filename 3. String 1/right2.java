/******************************************************************

Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start. The string length will be at least 2.

right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"

*******************************************************************/

import java.util.Scanner;
public class right2 {
  public static String right2(String str) {
    int n = str.length();
    return str.substring(n-2) + str.substring(0,n-2);
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return a 'rotated right 2' version where the last 2 chars are moved to the start. The string length will be at least 2.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(right2(str));
  }
}
