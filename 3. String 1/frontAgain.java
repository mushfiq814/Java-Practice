/******************************************************************


*******************************************************************/

import java.util.Scanner;
public class altPairs {
  public static String altPairs(String str) {
    String str2 = "";
    int n = str.length();

    if (n<=2) return str;

    for (int i=0; i<n-1 ; i+=4) {
      str2 += str.charAt(i);
      str2 += str.charAt(i+1);
    }
    if ((n-1)%4==0) str2 += str.charAt(n-1);
    return str2;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();
    int x = input.nextInt();

    System.out.println(altPairs(str));
  }
}
