/******************************************************************

  Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

  startOz("ozymandias") → "oz"
  startOz("bzoo") → "z"
  startOz("oxx") → "o"

*******************************************************************/

import java.util.Scanner;
public class startOz {
  public static String startOz(String str) {
    int n = str.length();
    String result = "";
    if (n>=1 && str.charAt(0)=='o') result = result + str.charAt(0);
    if (n>=2 && str.charAt(1)=='z') result = result + str.charAt(1);
    return result;
  }


  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so 'ozymandias' yields 'oz'.");
    System.out.println("");
    System.out.println("Enter a string.");
    String x = input.nextLine();

    System.out.println(startOz(x));
  }
}
