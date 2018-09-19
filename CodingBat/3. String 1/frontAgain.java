/******************************************************************

Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".

frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true

*******************************************************************/

import java.util.Scanner;
public class frontAgain {
  public static boolean frontAgain(String str) {
    int n = str.length();
    if (n>=2) return (str.substring(0,2).equals(str.substring(n-2,n)));
    else return false;
  }


  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with 'edited'.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(frontAgain(str));
  }
}
