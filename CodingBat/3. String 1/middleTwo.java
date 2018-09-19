/******************************************************************

Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"

*******************************************************************/

import java.util.Scanner;
public class middleTwo {
  public static String middleTwo(String str) {
    int n = str.length();
    int m = (n/2)-1;
    return str.substring(m,m+2);
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string of even length, return a string made of the middle two chars, so the string 'string' yields 'ri'. The string length will be at least 2.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(middleTwo(str));
  }
}
