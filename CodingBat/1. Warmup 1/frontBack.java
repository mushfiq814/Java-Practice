/******************************************************************

  Given a string, return a new string where the first and last chars have been exchanged.

  frontBack("code") → "eodc"
  frontBack("a") → "a"
  frontBack("ab") → "ba"
*******************************************************************/

import java.util.Scanner;
public class frontBack {
  public static String frontBack(String str) {
    int n = str.length();
    if (n>=2) return str.charAt(n-1) + str.substring(1,n-1) + str.charAt(0);
    else return str;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return a new string where the first and last chars have been exchanged.");
    System.out.println("");
    System.out.println("Enter a string");
    String a = input.nextLine();

    System.out.println(frontBack(a));
  }
}
