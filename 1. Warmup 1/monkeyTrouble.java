/******************************************************************

  We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

  monkeyTrouble(true, true) → true
  monkeyTrouble(false, false) → true
  monkeyTrouble(true, false) → false

*******************************************************************/

import java.util.Scanner;
public class monkeyTrouble {
  public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return ((aSmile && bSmile) || (!aSmile && !bSmile));
  }


  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling. We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.");
    System.out.println("");
    System.out.println("Is Monkey A smiling? (Enter True or False)");
    boolean x = input.nextBoolean();
    System.out.println("Is Monkey B smiling? (Enter True or False)");
    boolean y = input.nextBoolean();

    System.out.println(monkeyTrouble(x, y));
  }
}
