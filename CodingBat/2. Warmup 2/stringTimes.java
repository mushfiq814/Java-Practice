/******************************************************************

  Given a string and a non-negative int n, return a larger string that is n copies of the original string.

  stringTimes("Hi", 2) → "HiHi"
  stringTimes("Hi", 3) → "HiHiHi"
  stringTimes("Hi", 1) → "Hi"

*******************************************************************/

import java.util.Scanner;
public class stringTimes {
  public static String stringTimes(String str, int n) {
    String str2 = "";
    for (int i=0; i<n; i++) {
      str2 = str2 + str;
    }
    return str2;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string and a non-negative int n, return a larger string that is n copies of the original string.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();
    System.out.println("How many copies?");
    int x = input.nextInt();

    System.out.println(stringTimes(str, x));
  }
}
