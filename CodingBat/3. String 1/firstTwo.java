/******************************************************************

Given a string, return the string made of its first two chars,
so the String "Hello" yields "He".
If the string is shorter than length 2, return whatever there is, so "X" yields "X", and the empty string "" yields the empty string "". Note that str.length() returns the length of a string.

firstTwo("Hello") → "He"
firstTwo("abcdefg") → "ab"
firstTwo("ab") → "ab"

*******************************************************************/

import java.util.Scanner;
public class firstTwo {
  public static String firstTwo(String str) {
    int n = str.length();
    if (n>2) return str.substring(0,2);
    else return str;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return the string made of its first two chars, so the String 'Hello' yields 'He'. If the string is shorter than length 2, return whatever there is, so 'X' yields 'X', and the empty string '' yields the empty string ''. Note that str.length() returns the length of a string.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(firstTwo(str));
  }
}
