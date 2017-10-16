/******************************************************************

  Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

  everyNth("Miracle", 2) → "Mrce"
  everyNth("abcdefg", 2) → "aceg"
  everyNth("abcdefg", 3) → "adg"

*******************************************************************/

import java.util.Scanner;
public class everyNth {
  public static String everyNth(String str, int n) {
    int j = str.length();
    String result = "";
    for (int i=0; i<j; i+=n) {
      result = result + str.substring(i,i+1);
    }
    return result;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a non-empty string and an int N, return the string made starting with char 0, and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();
    System.out.println("Enter an integer: ");
    int x = input.nextInt();

    System.out.println(everyNth(str, x));
  }
}
