/******************************************************************

  Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).

  last2("hixxhi") → 1
  last2("xaxxaxaxx") → 1
  last2("axxxaaxx") → 2

*******************************************************************/

import java.util.Scanner;
public class last2 {
  public static int last2(String str) {
    int n = str.length();
    int count = 0;
    if (n>=2) {
      String last = str.substring(n-2);
      for (int i=0; i<n-2; i++) {
        if (str.substring(i,i+2).equals(last)) count++;
      }
    }
    return count;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the last 2 chars of the string, so 'hixxxhi' yields 1 (we won't count the end substring).");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(last2(str));
  }
}
