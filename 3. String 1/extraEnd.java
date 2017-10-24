/******************************************************************

Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.

extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"

*******************************************************************/

import java.util.Scanner;
public class extraEnd {
  public static String extraEnd(String str) {
    int n = str.length();
    return str.substring(n-2) + str.substring(n-2) + str.substring(n-2);
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return a new string made of 3 copies of the last 2 chars of the original string. The string length will be at least 2.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();
    
    System.out.println(extraEnd(str));
  }
}
