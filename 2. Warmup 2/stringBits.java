/******************************************************************

  Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

  stringBits("Hello") → "Hlo"
  stringBits("Hi") → "H"
  stringBits("Heeololeo") → "Hello"

*******************************************************************/

import java.util.Scanner;
public class stringBits {
  public static String stringBits(String str) {
    int n = str.length();
    String result = "";

    for (int i=0; i<n; i+=2) {
      result = result + str.charAt(i);
    }
    return result;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return a new string made of every other char starting with the first, so 'Hello' yields 'Hlo'.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(stringBits(str));
  }
}
