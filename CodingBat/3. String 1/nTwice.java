/******************************************************************

Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.

nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"

*******************************************************************/

import java.util.Scanner;
public class nTwice {
  public static String nTwice(String str, int n) {
    int m = str.length();
    return str.substring(0,n) + str.substring(m-n);
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string and an int n, return a string made of the first and last n chars from the string. The string length will be at least n.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();
    System.out.println("Enter an integer: ");
    int x = input.nextInt();

    System.out.println(nTwice(str, x));
  }
}
