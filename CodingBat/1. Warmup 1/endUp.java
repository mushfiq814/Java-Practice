/******************************************************************

  Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.

  endUp("Hello") → "HeLLO"
  endUp("hi there") → "hi thERE"
  endUp("hi") → "HI"

*******************************************************************/

import java.util.Scanner;
public class endUp {
  public static String endUp(String str) {
    int n = str.length();
    if (n>=3) {
      return str.substring(0,n-3) + str.substring(n-3,n).toUpperCase();
    }
    else return str.toUpperCase();
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.");
    System.out.println("");
    System.out.println("Enter a string.");
    String x = input.nextLine();

    System.out.println(endUp(x));
  }
}
