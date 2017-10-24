/******************************************************************

Given a string and a second "word" string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least length 1.

startWord("hippo", "hi") → "hi"
startWord("hippo", "xip") → "hip"
startWord("hippo", "i") → "h"

*******************************************************************/

import java.util.Scanner;
public class startWord {
  public static String startWord(String str, String word) {
    int n = word.length();
    int m = str.length();
    if (m==0 || n>m) return "";

    int store = 0;
    int istore = n;

    for (int i=1; i<n; i++) {
      if (store==0 && str.charAt(i)==word.charAt(i));
      else {
        store = 1;
        istore = i;
      }
    }
    if (store==0) return str.substring(0,istore);
    else return "";
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string and a second 'word' string, we'll say that the word matches the string if it appears at the front of the string, except its first char does not need to match exactly. On a match, return the front of the string, or otherwise return the empty string. So, so with the string 'hippo' the word 'hi' returns 'hi' and 'xip' returns 'hip'. The word will be at least length 1.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str1 = input.nextLine();
    System.out.println("Enter a word: ");
    String str2 = input.nextLine();

    System.out.println(startWord(str1, str2));
  }
}
