/******************************************************************

  Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.

  has271([1, 2, 7, 1]) → true
  has271([1, 2, 8, 1]) → false
  has271([2, 7, 1]) → true

*******************************************************************/

import java.util.Scanner;
public class has271 {
  public static boolean has271(int[] nums) {
    int n = nums.length;
    boolean result = false;
    if (n>=3) {
      for (int i=0; i<n-2; i++) {
        if (nums[i+1]==nums[i]+5 && (Math.abs(nums[i+2]-nums[i]+1))<=2 ) result = true;
        else result = false;
      }
    }
    else result = false;
    return result;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value, followed by the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the '1' differs by 2 or less from the correct value.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(has271(str));
  }
}
