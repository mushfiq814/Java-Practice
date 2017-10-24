/******************************************************************

Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.

lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"

*******************************************************************/

import java.util.Scanner;
public class lastChars {
  public static String lastChars(String a, String b) {
    int m = a.length();
    int n = b.length();

    if (m==0) {a="@"; m=1;}
    if (n==0) {b="@"; n=1;}

    return a.substring(0,1) + b.substring(n-1);
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given 2 strings, a and b, return a new string made of the first char of a and the last char of b, so 'yo' and 'java' yields 'ya'. If either string is length 0, use '@' for its missing char.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str1 = input.nextLine();
    System.out.println("Enter another string: ");
    String str2 = input.nextLine();

    System.out.println(lastChars(str1, str2));
  }
}
