/******************************************************************

Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.

without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""

*******************************************************************/

import java.util.Scanner;
public class without2 {
  public static String without2(String str) {
    int n = str.length();
    if (n>=2 && str.substring(0,2).equals(str.substring(n-2))) return str.substring(2);
    else return str;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring at the beginning, so 'HelloHe' yields 'lloHe'. The substring may overlap with itself, so 'Hi' yields ''. Otherwise, return the original string unchanged.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(without2(str));
  }
}
