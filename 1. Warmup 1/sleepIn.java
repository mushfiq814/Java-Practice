/******************************************************************

  The parameter weekday is true if it is a weekday,
  and the parameter vacation is true if we are on vacation.
  We sleep in if it is not a weekday or we're on vacation.
  Return true if we sleep in.

  sleepIn(false, false) -> true
  sleepIn(true, false) -> false
  sleepIn(false, true) -> true
  sleepIn(true, true) -> true

*******************************************************************/
import java.util.Scanner;
public class sleepIn {
  public static boolean sleepIn(boolean weekday, boolean vacation) {
    return (vacation || !weekday);
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.");

    System.out.println("Is it a weekday? (Enter True or False)");
    boolean x = input.nextBoolean();
    System.out.println("Are you on vacation? (Enter True or False)");
    boolean y = input.nextBoolean();

    System.out.println(sleepIn(x,y));
  }
}
