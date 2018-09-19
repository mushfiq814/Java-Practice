/******************************************************************

  Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.

  makeOutWord("<<>>", "Yay") → "<<Yay>>"
  makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
  makeOutWord("[[]]", "word") → "[[word]]"

*******************************************************************/

import java.util.Scanner;
public class makeOutWord {
  public static String makeOutWord(String out, String word) {
    return out.substring(0,2) + word + out.substring(2);
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given an 'out' string length 4, such as '<<>>', and a word, return a new string where the word is in the middle of the out string, e.g. '<<word>>'. Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str1 = input.nextLine();
    System.out.println("Enter another string: ");
    String str2 = input.nextLine();

    System.out.println(makeOutWord(str1, str2));
  }
}
