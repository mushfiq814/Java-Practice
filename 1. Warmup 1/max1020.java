/******************************************************************

  Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.

  max1020(11, 19) → 19
  max1020(19, 11) → 19
  max1020(11, 9) → 11

*******************************************************************/

import java.util.Scanner;
public class max1020 {
  public static int max1020(int a, int b) {
    if (a>=10 && a<=20 && b>=10 && b<=20) {
      if (a>b) return a;
      else return b;
    }
    else if ((a<10 || a>20) && (b>=10 && b<=20)) return b;
    else if ((b<10 || b>20) && (a>=10 && a<=20)) return a;
    else return 0;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is in that range.");
    System.out.println("");
    System.out.println("Enter 2 integers.");
    int x = input.nextInt();
    int y = input.nextInt();

    System.out.println(max1020(x, y));
  }
}
