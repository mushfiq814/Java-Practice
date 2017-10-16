/******************************************************************

  Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt".
  The original string will be length 1 or more.

  backAround("cat") → "tcatt"
  backAround("Hello") → "oHelloo"
  backAround("a") → "aaa"

*******************************************************************/

import java.util.Scanner;
public class backAround {
  public static String backAround(String str) {
    int n = str.length();
    return str.charAt(n - 1) + str + str.charAt(n - 1);
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, take the last char and return a new string with the last char added at the front and back, so 'cat' yields 'tcatt'. The original string will be length 1 or more.");
    System.out.printl("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(backAround(str));
  }
}
