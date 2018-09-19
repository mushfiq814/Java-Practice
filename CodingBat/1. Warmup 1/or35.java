/******************************************************************

  Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % "mod" operator -- see Introduction to Mod

  or35(3) → true
  or35(10) → true
  or35(8) → false

*******************************************************************/

import java.util.Scanner;
public class or35 {
  public static boolean or35(int n) {
    return (n%3==0 || n%5==0);
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the % 'mod' operator.");
    System.out.println("");
    System.out.println("Enter a non-negative integer.");
    int a = input.nextInt();

    System.out.println(or35(a));
  }
}
