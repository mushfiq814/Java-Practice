/******************************************************************

  Given three int values, a b c, return the largest.

  intMax(1, 2, 3) → 3
  intMax(1, 3, 2) → 3
  intMax(3, 2, 1) → 3

*******************************************************************/

import java.util.Scanner;
public class intMax {
  public static int intMax(int a, int b, int c) {
    int max = Math.max(a,b);
    max = Math.max(max,c);
    return max;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given three int values, a b c, return the largest.");
    System.out.println("");
    System.out.println("Enter 3 integers.");
    int x = input.nextInt();
    int y = input.nextInt();
    int z = input.nextInt();

    System.out.println(intMax(x, y, z));
  }
}
