/******************************************************************

Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end. The string length will be at least 2.

left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"

*******************************************************************/

import java.util.Scanner;
public class left2 {
  public static String left2(String str) {
    int n = str.length();
    if (n>=2) {
      return str.substring(2) + str.substring(0,2);
    }
    else return str;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return a 'rotated left 2' version where the first 2 chars are moved to the end. The string length will be at least 2.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(left2(str));
  }
}
