/******************************************************************

Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"

*******************************************************************/

import java.util.Scanner;
public class deFront {
  public static String deFront(String str) {
    int n = str.length();
    String str2 = "";

    if (str.charAt(0)=='a') str2 += str.charAt(0);
    if (str.charAt(1)=='b') str2 += str.charAt(1);

    return str2 + str.substring(2);
  }


  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(deFront(str));
  }
}
