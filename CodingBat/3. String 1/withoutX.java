/******************************************************************

Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"

*******************************************************************/

import java.util.Scanner;
public class withoutX {
  public static String withoutX(String str) {
    if (str.length() > 0 && str.charAt(0) == 'x') str = str.substring(1);
    if (str.length() > 0 && str.charAt(str.length()-1) == 'x') str = str.substring(0, str.length()-1);
    return str;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return the string unchanged.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(withoutX(str));
  }
}
