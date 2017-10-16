/******************************************************************

  We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.

  hasTeen(13, 20, 10) → true
  hasTeen(20, 19, 10) → true
  hasTeen(20, 10, 13) → true

*******************************************************************/

import java.util.Scanner;
public class hasTeen {
  public static boolean hasTeen(int a, int b, int c) {
    return ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19));
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("We'll say that a number is 'teen' if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.");
    System.out.println("");
    System.out.println("Enter 3 integers: ");
    int x = input.nextInt();
    int y = input.nextInt();
    int z = input.nextInt();

    System.out.println(hasTeen(x,y,z));
  }
}
