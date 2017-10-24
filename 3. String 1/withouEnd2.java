/******************************************************************

Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""

*******************************************************************/

import java.util.Scanner;
public class withouEnd2 {
  public static String withouEnd2(String str) {
    int n = str.length();
    if (n>=2) return str.substring(1,n-1);
    else return "";
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(withouEnd2(str));
  }
}
