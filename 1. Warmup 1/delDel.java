/******************************************************************

  Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted. Otherwise, return the string unchanged.

  delDel("adelbc") → "abc"
  delDel("adelHello") → "aHello"
  delDel("adedbc") → "adedbc"

*******************************************************************/

import java.util.Scanner;
public class delDel {
  public static String delDel(String str) {
    int n = str.length();
    if (n>=4) {
      if (str.substring(1,4).equals("del")) return str.substring(0,1) + str.substring(4);
      else return str;
    }
    else return str;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, if the string 'del' appears starting at index 1, return a string where that 'del' has been deleted. Otherwise, return the string unchanged.");
    System.out.println("");
    System.out.println("Enter a string.");
    String x = input.nextLine();

    System.out.println(delDel(x));
  }
}
