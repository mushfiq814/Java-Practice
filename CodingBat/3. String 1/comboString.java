/******************************************************************

Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).

comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"

*******************************************************************/

import java.util.Scanner;
public class comboString {
  public static String comboString(String a, String b) {
    int m = a.length();
    int n = b.length();
    if (m>n) return b+a+b;
    else return a+b+a;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside. The strings will not be the same length, but they may be empty (length 0).");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str1 = input.nextLine();
    System.out.println("Enter a string: ");
    String str2 = input.nextLine();

    System.out.println(comboString(str1, str2));
  }
}
