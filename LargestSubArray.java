/*62. Write a program in Java to find the largest subarray with equal number of 0s and 1s.
The given array is : 0 1 0 0 1 1 0 1 1 1
Subarray found from the index 0 to 7
 */

package array;

public class LargestSubArray {
    // This function Prints the starting and ending
    // indexes of the largest subarray with equal
    // number of 0s and 1s. Also returns the size
    // of such subarray.

    int findSubArray(int arr[], int n)
    {
        int sum = 0;
        int maxsize = -1, startindex = 0;
        int endindex = 0;

        // Pick a starting point as i

        for (int i = 0; i < n - 1; i++) {
            sum = (arr[i] == 0) ? -1 : 1;

            // Consider all subarrays starting from i

            for (int j = i + 1; j < n; j++) {
                if (arr[j] == 0)
                    sum += -1;
                else
                    sum += 1;

                // If this is a 0 sum subarray, then
                // compare it with maximum size subarray
                // calculated so far

                if (sum == 0 && maxsize < j - i + 1) {
                    maxsize = j - i + 1;
                    startindex = i;
                }
            }
        }
        endindex = startindex + maxsize - 1;
        if (maxsize == -1)
            System.out.println("No such subarray");
        else
            System.out.println(startindex + " to " + endindex);

        return maxsize;
    }

    /* Driver program to test the above functions */

    public static void main(String[] args)
    {
        LargestSubArray sub;
        sub = new LargestSubArray();
        int arr[] = { 0, 1, 0, 0, 1, 1, 0, 1, 1, 1 };
        int size = arr.length;
        int max = 0;
        int n = (int)arr.length;
        System.out.println("The given array is :  ");
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            System.out.print("\n"+arr[i] + "  ");
        }
        System.out.println("\n\n"+"Subarray found from the index:: ");
        sub.findSubArray(arr, size);
    }
}
