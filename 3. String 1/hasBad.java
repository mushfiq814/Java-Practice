/******************************************************************

Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0. Note: use .equals() to compare 2 strings.

hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false

*******************************************************************/

import java.util.Scanner;
public class hasBad {
  public static boolean hasBad(String str) {
    int n = str.length();
    if (n>=3 && str.substring(0,3).equals("bad")) return true;
    if (n>=4 && str.substring(1,4).equals("bad")) return true;
    else return false;

    //return (str.indexOf("bad") == 0 || str.indexOf("bad") == 1 );
    // Alternately one could use indexOf() -- that code is short
    // but it runs much slower, since it needlessly checks over the whole
    // string.
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return true if 'bad' appears starting at index 0 or 1 in the string, such as with 'badxxx' or 'xbadxx' but not 'xxbadxx'. The string may be any length, including 0. Note: use .equals() to compare 2 strings.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(hasBad(str));
  }
}
