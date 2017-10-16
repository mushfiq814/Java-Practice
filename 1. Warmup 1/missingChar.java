/******************************************************************

  Given a non-empty string and an int n, return a new string where the char at index n has been removed.
  The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).

  missingChar("kitten", 1) → "ktten"
  missingChar("kitten", 0) → "itten"
  missingChar("kitten", 4) → "kittn"

*******************************************************************/

import java.util.Scanner;
public class missingChar {
  public static String missingChar(String str, int n) {
    String first = str.substring(0,n);
    String last = str.substring(n+1);
    return first + last;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a non-empty string and an int n, return a new string where the char at index n has been removed. The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).");
    System.out.printl("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();
    System.out.println("Which string index would you like to be removed?");
    int n = input.nextInt();

    System.out.println(missingChar(str, n));
  }
}
