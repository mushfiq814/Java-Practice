/******************************************************************

  Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are removed, but the "a" can be any char. The "yak" strings will not overlap.

  stringYak("yakpak") → "pak"
  stringYak("pakyak") → "pak"
  stringYak("yak123ya") → "123ya"

*******************************************************************/

import java.util.Scanner;
public class stringYak {
  public static String stringYak(String str) {
    int n = str.length();
    String nYak = "";

    for(int i = 0; i < n; i++){
      if(i+2 < n && str.charAt(i) == 'y' && str.charAt(i+2) == 'k')
        i += 2;
      else
      nYak += str.charAt(i);
    }
    return nYak;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Suppose the string 'yak' is unlucky. Given a string, return a version where all the 'yak' are removed, but the 'a' can be any char. The 'yak' strings will not overlap.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(stringYak(str));
  }
}
