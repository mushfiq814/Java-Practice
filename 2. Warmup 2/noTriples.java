/******************************************************************

  Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.

  noTriples([1, 1, 2, 2, 1]) → true
  noTriples([1, 1, 2, 2, 2, 1]) → false
  noTriples([1, 1, 1, 2, 2, 2, 1]) → false

*******************************************************************/

import java.util.Scanner;
public class noTriples {
  public static  boolean noTriples(int[] nums) {
    int n = nums.length;
    boolean result = true;
    int store = 0;

    for (int i=0; i<n-2; i++) {
      if (nums[i]==nums[i+1] && nums[i+1]==nums[i+2] && store==0) {
        result = false;
        store = 1;
      }
    }

    return result;
  }

  public static void main(String arg[]) {
    Scanner input = new Scanner(System.in);

    System.out.println("Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array. Return true if the array does not contain any triples.");
    System.out.println("");
    System.out.println("Enter a string: ");
    String str = input.nextLine();

    System.out.println(noTriples(str));
  }
}
