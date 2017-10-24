/******************************************************************

Given a string, return true if it ends in "ly".

endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false

*******************************************************************/

import java.util.Scanner;
public class endsLy {
  public static boolean endsLy(String str) {
    int n = str.length();
    if (n>=2) return (str.substring(n-2,n).equals("ly"));
    else return false;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return true if it ends in 'ly'.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(endsLy(str));
  }
}
