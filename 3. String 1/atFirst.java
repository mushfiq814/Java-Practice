/******************************************************************

Given a string, return a string length 2 made of its first 2 chars.
If the string length is less than 2, use '@' for the missing chars.

atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"

*******************************************************************/

import java.util.Scanner;
public class atFirst {
  public static String atFirst(String str) {
    int n = str.length();
    if (n>=2) return str.substring(0,2);
    else if (n==1) return str.substring(0,1) + "@";
    else return "@@";
  }


  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return a string length 2 made of its first 2 chars. If the string length is less than 2, use '@' for the missing chars.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(atFirst(str));
  }
}
