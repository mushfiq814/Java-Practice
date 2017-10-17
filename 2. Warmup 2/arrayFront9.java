/******************************************************************

  Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.

  arrayFront9([1, 2, 9, 3, 4]) → true
  arrayFront9([1, 2, 3, 4, 9]) → false
  arrayFront9([1, 2, 3, 4, 5]) → false

*******************************************************************/

import java.util.Scanner;
public class arrayFront9 {
  public static boolean arrayFront9(int[] nums) {
    int n = nums.length;
    boolean result = false;
    if (n>=4) {
      for ( int i=0; i<4; i++) {
        if (nums[i]==9) result = true;
      }
    }
    else {
      for ( int i=0; i<n; i++) {
        if (nums[i]==9) result = true;
      }
    }
    return result;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given an array of ints, return true if one of the first 4 elements in the array is a 9. The array length may be less than 4.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(arrayFront9(str));
  }
}
