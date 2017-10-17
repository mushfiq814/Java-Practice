/******************************************************************

  Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".

  countXX("abcxx") → 1
  countXX("xxx") → 2
  countXX("xxxx") → 3

*******************************************************************/

import java.util.Scanner;
public class countXX {
  public static int countXX(String str) {
    int n = str.length();
    int count = 0;
    for ( int i=0; i<n-1; i++) {
      if (str.substring(i,i+2).equals("xx")) count++;
    }
    return count;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Count the number of 'xx' in the given string. We'll say that overlapping is allowed, so 'xxx' contains 2 'xx'.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(countXX(str));
  }
}
