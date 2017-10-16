/******************************************************************

  Given a string, return true if the string starts with "hi" and false otherwise.

  startHi("hi there") → true
  startHi("hi") → true
  startHi("hello hi") → false

*******************************************************************/

import java.util.Scanner;
public class startHi {
  public static boolean startHi(String str) {
    if (str.length() >= 2) {
      return (str.substring(0,2).equals("hi"));
    }
    else return false;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return true if the string starts with 'hi' and false otherwise.");

    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(startHi(str));
  }
}
