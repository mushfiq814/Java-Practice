/******************************************************************

  Given an array of ints, return the number of 9's in the array.

  arrayCount9([1, 2, 9]) → 1
  arrayCount9([1, 9, 9]) → 2
  arrayCount9([1, 9, 9, 3, 9]) → 3

*******************************************************************/

import java.util.Scanner;
public class arrayCount9 {
  public static int arrayCount9(int[] nums) {
    int n = nums.length;
    int count = 0;
    for ( int i=0; i<n; i++) {
      if (nums[i] == 9) count++;
    }
    return count;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given an array of ints, return the number of 9's in the array.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(arrayCount9(str));
  }
}
