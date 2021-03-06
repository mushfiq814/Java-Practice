/******************************************************************

Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".

firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"

*******************************************************************/

import java.util.Scanner;
public class firstHalf {
  public static String firstHalf(String str) {
    int n = str.length();
    return str.substring(0,n/2);
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string of even length, return the first half. So the string 'WooHoo' yields 'Woo'.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(firstHalf(str));
  }
}
