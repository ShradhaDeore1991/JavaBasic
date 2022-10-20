/*69. Write a program in Java to find out the maximum difference between
any two elements such that larger element appears after the smaller number.
OUTPUT::
The given array is : 7 9 5 6 13 2
The elements which provide maximum difference is: 5, 13
The Maximum difference between two elements in the array is: 8
 */


package array;

import java.util.Arrays;

public class MaximumDifference {
    public static int diff_between_two_elemnts(int[] nums)
    {
        int diff_two_elemnts = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                diff_two_elemnts = Integer.max(diff_two_elemnts,nums[j] - nums[i]);
            }
        }

        return diff_two_elemnts;
    }

    public static void main(String[] args)
    {
        int[] nums = { 7, 9, 5, 6, 13, 2 };
        System.out.println("\nOriginal array: "+ Arrays.toString(nums));

        System.out.print("The Maximum difference between two elements in the array is:\n" +
                                diff_between_two_elemnts(nums));
    }
}
