/******************************************************************

  Given an int n, return the absolute difference between n and 21,
  except return double the absolute difference if n is over 21.

  diff21(19) → 2
  diff21(10) → 11
  diff21(21) → 0
  diff21(22) → 2
  diff21(25) → 8
  diff21(30) → 18
  diff21(0) → 21
  diff21(1) → 20
  diff21(2) → 19
  diff21(-1) → 22
  diff21(-2) → 23
  diff21(50) → 58

*******************************************************************/
import java.util.Scanner;
public class diff21 {
  public static int diff21(int n) {
    if (n <= 21) return 21 - n;
    else return 2 * ( n - 21 );
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.");

    System.out.println("Enter an int: ");
    int n = input.nextInt();

    System.out.println(diff21(n));
  }
}
