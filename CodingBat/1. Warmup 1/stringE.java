/******************************************************************

  Return true if the given string contains between 1 and 3 'e' chars.

  stringE("Hello") → true
  stringE("Heelle") → true
  stringE("Heelele") → false

*******************************************************************/

import java.util.Scanner;
public class stringE {
  public static boolean stringE(String str) {
    int n = str.length();
    int count = 0;
    for (int i = 0; i < n; i++) {
      if(str.charAt(i)=='e') count++;
    }
    if (count >= 1 && count <= 3) return true;
    else return false;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Return true if the given string contains between 1 and 3 'e' chars.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(stringE(str));
  }
}
