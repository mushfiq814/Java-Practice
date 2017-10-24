/******************************************************************

  Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

  helloName("Bob") → "Hello Bob!"
  helloName("Alice") → "Hello Alice!"
  helloName("X") → "Hello X!"

*******************************************************************/

import java.util.Scanner;
public class helloName {
  public static String helloName(String name) {
    return "Hello " + name + "!";
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string name, e.g. 'Bob', return a greeting of the form 'Hello Bob!''.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(helloName(str));
  }
}
