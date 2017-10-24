/******************************************************************

Given two strings, append them together (known as "concatenation") and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any length.

minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"

*******************************************************************/

import java.util.Scanner;
public class minCat {
  public static String minCat(String a, String b) {
    int m = a.length();
    int n = b.length();

    if (m<n) return a + b.substring(n-m);
    else return a.substring(m-n) + b;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given two strings, append them together (known as 'concatenation') and return the result. However, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string. So 'Hello' and 'Hi' yield 'loHi'. The strings may be any length.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str1 = input.nextLine();
    System.out.println("Enter another string: ");
    String str2 = input.nextLine();

    System.out.println(minCat(str1, str2));
  }
}
