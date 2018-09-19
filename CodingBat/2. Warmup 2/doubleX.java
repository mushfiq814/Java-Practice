/******************************************************************

  Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

  doubleX("axxbb") → true
  doubleX("axaxax") → false
  doubleX("xxxxx") → true

*******************************************************************/

import java.util.Scanner;
public class doubleX {
  public static boolean doubleX(String str) {
    int n = str.length();
    boolean result = false;
    int store = 0;

    for (int i=0; i<n-1; i++) {
      if (str.charAt(i) == 'x' && store == 0) {
        store = 1;
        if (str.charAt(i+1) == 'x') result = true;
      }
    }
    return result;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return true if the first instance of 'x' in the string is immediately followed by another 'x'.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(doubleX(str));
  }
}
