/******************************************************************

  Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second "6" is actually a 7.

  array667([6, 6, 2]) → 1
  array667([6, 6, 2, 6]) → 1
  array667([6, 7, 2, 6]) → 1

*******************************************************************/

import java.util.Scanner;
public class array667 {
  public static int array667(int[] nums) {
    int n = nums.length;
    int count = 0;
    for ( int i=0; i<n-1; i++) {
      if (nums[i] == 6 && (nums[i+1]==6 || nums[i+1]==7)) count++;
    }
    return count;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given an array of ints, return the number of times that two 6's are next to each other in the array. Also count instances where the second '6' is actually a 7.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(array667(str));
  }
}
