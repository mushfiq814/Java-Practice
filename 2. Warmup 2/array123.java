/******************************************************************

  Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

  array123([1, 1, 2, 3, 1]) → true
  array123([1, 1, 2, 4, 1]) → false
  array123([1, 1, 2, 1, 2, 3]) → true

*******************************************************************/

import java.util.Scanner;
public class array123 {
  public static boolean array123(int[] nums) {
    int n = nums.length;
    boolean result = false;
    for (int i=0; i<n-2; i++) {
      if (nums[i]==1 && nums[i+1]==2 && nums[i+2]==3) result = true;
    }
    return result;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.");
    System.out.println("");
    System.out.println("How many integers do you want in the array?");
    int j = input.nextInt;
    int array[] = new int[j];
    System.out.println("Enter the elements in the array: ");
    for (int i=0; i<j; i++) {
      System.out.println("Enter element " + i );
      array[i] = input.nextInt();
    }
    for (int i=0; i<j; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println(array123(array));
  }
}
