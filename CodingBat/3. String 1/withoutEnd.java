/******************************************************************

Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.

withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"

*******************************************************************/

import java.util.Scanner;
public class withoutEnd {
  public static String withoutEnd(String str) {
    int n = str.length();
    return str.substring(1,n-1);
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return a version without the first and last char, so 'Hello' yields 'ell'. The string length will be at least 2.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(withoutEnd(str));
  }
}
