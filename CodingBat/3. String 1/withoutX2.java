/******************************************************************

Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"

*******************************************************************/

import java.util.Scanner;
public class withoutX2 {
  public static String withoutX2(String str) {
    if (str.length()>=2 && str.charAt(1)=='x') str = str.substring(0,1) + str.substring(2);
    if (str.length()>=1 && str.charAt(0)=='x') str = str.substring(1);
    return str;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise return the string unchanged. This is a little harder than it looks.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(withoutX2(str));
  }
}
