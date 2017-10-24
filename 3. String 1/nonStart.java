/******************************************************************

  Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

  nonStart("Hello", "There") → "ellohere"
  nonStart("java", "code") → "avaode"
  nonStart("shotl", "java") → "hotlava"

*******************************************************************/

import java.util.Scanner;
public class nonStart {
  public static String nonStart(String a, String b) {
  return a.substring(1) + b.substring(1);
}


  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str1 = input.nextLine();
    System.out.println("Enter another string: ");
    String str2 = input.nextLine();

    System.out.println(nonStart(str1, str2));
  }
}
