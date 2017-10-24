/******************************************************************

Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".

makeAbba("Hi", "Bye") → "HiByeByeHi"
makeAbba("Yo", "Alice") → "YoAliceAliceYo"
makeAbba("What", "Up") → "WhatUpUpWhat"

*******************************************************************/

import java.util.Scanner;
public class makeAbba {
  public static String makeAbba(String a, String b) {
    return a + b + b + a;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given two strings, a and b, return the result of putting them together in the order abba, e.g. 'Hi' and 'Bye' returns 'HiByeByeHi'.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str1 = input.nextLine();
    System.out.println("Enter another string: ");
    String str2 = input.nextLine();

    System.out.println(makeAbba(str1, str2));
  }
}
