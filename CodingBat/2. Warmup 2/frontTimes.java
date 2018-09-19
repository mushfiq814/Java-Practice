/******************************************************************

  Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;

  frontTimes("Chocolate", 2) → "ChoCho"
  frontTimes("Chocolate", 3) → "ChoChoCho"
  frontTimes("Abc", 3) → "AbcAbcAbc"

*******************************************************************/

import java.util.Scanner;
public class frontTimes {
  public static String frontTimes(String str, int n) {
    int j = str.length();
    String front = "", result = "";

    if (j>=3) front = str.substring(0,3);
    else front = str;

    for (int i=0; i<n; i++) {
      result += front;
    }
    return result;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars, or whatever is there if the string is less than length 3. Return n copies of the front;");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();
    System.out.println("How many copies?");
    int x = input.nextInt();

    System.out.println(frontTimes(str, x));
  }
}
