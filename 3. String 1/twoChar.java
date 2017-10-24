/******************************************************************

Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.

twoChar("java", 0) → "ja"
twoChar("java", 2) → "va"
twoChar("java", 3) → "ja"

*******************************************************************/

import java.util.Scanner;
public class twoChar {
  public static String twoChar(String str, int index) {
    int n = str.length();
    if (index <= n-2 && index >=0) return str.substring(index,index+2);
    else return str.substring(0,2);
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string and an index, return a string length 2 starting at the given index. If the index is too big or too small to define a string length 2, use the first 2 chars. The string length will be at least 2.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();
    System.out.println("Enter an integer: ");
    int x = input.nextInt();

    System.out.println(twoChar(str, x));
  }
}
