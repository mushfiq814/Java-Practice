/******************************************************************

  Given a non-empty string like "Code" return a string like "CCoCodCode".

  stringSplosion("Code") → "CCoCodCode"
  stringSplosion("abc") → "aababc"
  stringSplosion("ab") → "aab"

*******************************************************************/

import java.util.Scanner;
public class stringSplosion {
  public static String stringSplosion(String str) {
    int n = str.length();
    String result = "";
    for (int i=0; i<n ; i++) {
      result = result + str.substring(0,i+1);
    }
    return result;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a non-empty string like 'Code' return a string like 'CCoCodCode'");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(stringSplosion(str));
  }
}
