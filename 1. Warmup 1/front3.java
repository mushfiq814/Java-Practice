/******************************************************************

  Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

  front3("Java") → "JavJavJav"
  front3("Chocolate") → "ChoChoCho"
  front3("abc") → "abcabcabc"

*******************************************************************/

import java.util.Scanner;
public class front3 {
  public static String front3(String str) {
    int n = str.length();
    if (n>=3) {
      String last = str.substring(0,3);
      return last + last + last;
    }
    else return str + str + str;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.");
    System.out.println("");
    System.out.println("Enter a string.");
    String x = input.nextLine();

    System.out.println(front3(x));
  }
}
