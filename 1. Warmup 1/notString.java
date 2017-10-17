/******************************************************************

  Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.

  notString("candy") → "not candy"
  notString("x") → "not x"
  notString("not bad") → "not bad"

*******************************************************************/

import java.util.Scanner;
public class notString {
  public static String notString(String str) {
    int n = str.length();
    if (n>=3) {
      if (str.substring(0,3).equals("not")) return str;
      else return "not " + str;
    }
    else return "not " + str;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return a new string where 'not ' has been added to the front. However, if the string already begins with 'not', return the string unchanged. Note: use .equals() to compare 2 strings.");
    System.out.println("");
    System.out.println("Enter a string.");
    String x = input.nextLine();

    System.out.println(notString(x));
  }
}
