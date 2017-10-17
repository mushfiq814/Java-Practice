/******************************************************************

  Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.

  front22("kitten") → "kikittenki"
  front22("Ha") → "HaHaHa"
  front22("abc") → "ababcab"

*******************************************************************/

import java.util.Scanner;
public class front22 {
  public static String front22(String str) {
    int n = str.length();
    if (n>=2) {
      String first = str.substring(0,2);
      return first + str + first;
    }
    else return str + str + str;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so 'kitten' yields 'kikittenki'. If the string length is less than 2, use whatever chars are there.");
    System.out.println("");
    System.out.println("Enter a string.");
    String x = input.nextLine();

    System.out.println(front22(x));
  }
}
