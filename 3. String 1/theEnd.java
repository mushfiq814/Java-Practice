/******************************************************************

  Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.

  theEnd("Hello", true) → "H"
  theEnd("Hello", false) → "o"
  theEnd("oh", true) → "o"

*******************************************************************/

import java.util.Scanner;
public class theEnd {
  public static String theEnd(String str, boolean front) {
    int n = str.length();
    String first = str.substring(0,1);
    String end = str.substring(n-1,n);

    if (front == true) return first;
    else return end;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1 from its back. The string will be non-empty.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();
    System.out.println("Enter True or False.");
    Boolean x = input.nextBoolean();

    System.out.println(theEnd(str, x));
  }
}
