/******************************************************************

  Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should not be removed.

  stringX("xxHxix") → "xHix"
  stringX("abxxxcd") → "abcd"
  stringX("xabxxxcdx") → "xabcdx"

*******************************************************************/

import java.util.Scanner;
public class stringX {
  public static String stringX(String str) {
    int n = str.length();
    String lit = "";

    for (int i=0; i<n; i++) {
      if (str.charAt(i) != 'x' || (i == 0) || (i == n-1))
        lit += str.charAt(i);
    }
    return lit;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return a version where all the 'x' have been removed. Except an 'x' at the very start or end should not be removed.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(stringX(str));
  }
}
