/******************************************************************

  We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

  parrotTrouble(true, 6) → true
  parrotTrouble(true, 7) → false
  parrotTrouble(false, 6) → false

*******************************************************************/

import java.util.Scanner;
public class parrotTrouble {
  public static boolean parrotTrouble(boolean talking, int hour) {
    return (talking && (hour<7 || hour>20) );
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("We have a loud talking parrot. The 'hour' parameter is the current hour time in the range 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.");
    System.out.println("");
    System.out.println("Is the Parrot talking? (Enter True or False)");
    boolean x = input.nextBoolean();
    System.out.println("What hour of day is it? In the range 0 to 23.");
    int y = input.nextInt();

    System.out.println(parrotTrouble(x, y));
  }
}
