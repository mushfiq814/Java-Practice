/******************************************************************

Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.

seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"

*******************************************************************/

import java.util.Scanner;
public class seeColor {
  public static String seeColor(String str) {
    int n = str.length();
    if (n>=3 && str.substring(0,3).equals("red")) return "red";
    if (n>=4 && str.substring(0,4).equals("blue")) return "blue";
    else return "";
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given a string, if the string begins with 'red' or 'blue' return that color string, otherwise return the empty string.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(seeColor(str));
  }
}
