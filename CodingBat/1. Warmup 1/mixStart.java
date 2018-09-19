/******************************************************************

  Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

  mixStart("mix snacks") → true
  mixStart("pix snacks") → true
  mixStart("piz snacks") → false

*******************************************************************/

import java.util.Scanner;
public class mixStart {
  public static boolean mixStart(String str) {
    int i = str.length();
    if (i>=3) {
      return (str.substring(1,3).equals("ix"));
    }
    else return false;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Return true if the given string begins with 'mix', except the 'm' can be anything, so 'pix', '9ix' .. all count.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(mixStart(str));
  }
}
