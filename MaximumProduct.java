/*61. Write a program in Java to find maximum product subarray in a given array.
The given array is : -4 9 -7 0 -15 6 2 -3
The maximum product of a sub-array in the given array is: 540
 */

package array;

public class MaximumProduct {
    static int maxSubarrayProduct(int arr[])
    {
        // Initializing result
        int result = arr[0];
        int n = arr.length;

        for (int i = 0; i < n; i++)
        {
            int mul = arr[i];
            // traversing in current subarray
            for (int j = i + 1; j < n; j++)
            {
                // updating result every time
                // to keep an eye over the
                // maximum product
                result = Math.max(result, mul);
                mul *= arr[j];
            }
            // updating the result for (n-1)th index.
            result = Math.max(result, mul);
        }
        return result;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int arr[] = { -4, 9, -7, 0, -15, 6, 2, -3 };
        int max = 0;
        int n = (int)arr.length;
        System.out.println("The given array is :  ");
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            System.out.print(arr[i] + "  ");
        }
        System.out.println("\n"+"Maximum Sub array product is :: " + maxSubarrayProduct(arr));
    }
}
