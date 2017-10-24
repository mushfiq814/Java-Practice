/******************************************************************

Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"

*******************************************************************/

import java.util.Scanner;
public class altPairs {
  public static String conCat(String a, String b) {
    int m = a.length();
    int n = b.length();

    if (m>0 && n >0 && a.charAt(m-1)==b.charAt(0)) return a.substring(0,m-1) + b;
    else return a+b;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given two strings, append them together (known as 'concatenation') and return the result. However, if the concatenation creates a double-char, then omit one of the chars, so 'abc' and 'cat' yields 'abcat'.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();
    int x = input.nextInt();

    System.out.println(altPairs(str));
  }
}
