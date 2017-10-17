/******************************************************************

  Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

  stringMatch("xxcaazz", "xxbaaz") → 3
  stringMatch("abc", "abc") → 2
  stringMatch("abc", "axc") → 0

*******************************************************************/

import java.util.Scanner;
public class stringMatch {
  public static int stringMatch(String a, String b) {
    int m = a.length();
    int n = b.length();
    int count = 0;
    int l;

    if(m<n) l = m;
    else l = n;

    for ( int i=0; i<(l-1); i++) {
      if (a.substring(i,i+2).equals(b.substring(i,i+2))) count++;
    }
    return count;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So 'xxcaazz' and 'xxbaaz' yields 3, since the 'xx', 'aa', and 'az' substrings appear in the same place in both strings.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str1 = input.nextLine();
    System.out.println("Enter another string: ");
    String str2 = input.nextLine();

    System.out.println(stringMatch(str1, str2));
  }
}
