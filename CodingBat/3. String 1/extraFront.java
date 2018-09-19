/******************************************************************

Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.

extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"

*******************************************************************/

import java.util.Scanner;
public class extraFront {
  public static String extraFront(String str) {
    int n = str.length();
    if (n>=2) return str.substring(0,2) + str.substring(0,2) + str.substring(0,2);
    else return str + str + str;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any length. If there are fewer than 2 chars, use whatever is there.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(extraFront(str));
  }
}
