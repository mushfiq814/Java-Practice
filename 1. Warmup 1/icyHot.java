/******************************************************************

  Given two temperatures, return true if one is less than 0 and the other is greater than 100.

  icyHot(120, -1) → true
  icyHot(-1, 120) → true
  icyHot(2, 120) → false

*******************************************************************/

import java.util.Scanner;
public class icyHot {
  public static boolean icyHot(int temp1, int temp2) {
    return ((temp1<0 && temp2>100) || (temp1>100 && temp2<0));
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given two temperatures, return true if one is less than 0 and the other is greater than 100.");
    System.out.println("");
    System.out.println("Enter two temperatures as integers.");
    int x = input.nextInt();
    int y = input.nextInt();

    System.out.println(icyHot(x, y));
  }
}
