/******************************************************************

Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields "codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"

*******************************************************************/

import java.util.Scanner;
public class lastTwo {
  public static String lastTwo(String str) {
    int n = str.length();
    if (n>=2) {
      return str.substring(0,n-2) + str.substring(n-1,n) + str.substring(n-2,n-1);
    }
    else return str;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so 'coding' yields 'codign'.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(lastTwo(str));
  }
}
