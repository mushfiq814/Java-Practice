/******************************************************************

Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length will be at least 3.

middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"

*******************************************************************/

import java.util.Scanner;
public class middleThree {
  public static String middleThree(String str) {
    int n = str.length()/2;
    return str.substring(n-1,n+2);
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string of odd length, return the string length 3 from its middle, so 'Candy' yields 'and'. The string length will be at least 3.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(middleThree(str));
  }
}
