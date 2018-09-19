/******************************************************************

  Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

  closeTen(8, 13) → 8
  closeTen(13, 8) → 8
  closeTen(13, 7) → 0

*******************************************************************/

import java.util.Scanner;
public class closeTen {
  public static int closeTen(int a, int b) {
    int c = Math.abs(a-10);
    int d = Math.abs(b-10);
    if (c > d) return b;
    if (c < d) return a;
    if (c == d) return 0;
    else return 0;
  }


  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.");
    System.out.println("");
    System.out.println("Enter two integers: ");
    int x = input.nextInt();
    int y = input.nextInt();

    System.out.println(closeTen(x, y));
  }
}
