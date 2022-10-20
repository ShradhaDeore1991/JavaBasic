/*54. Write a program in Java to sort an array of 0s, 1s and 2s.
The given array is : 0 1 2 2 1 0 0 2 0 1 1 0
Output::
After sorting the elements in the array are:
0 0 0 0 0 1 1 1 1 2 2 2
 */

package array;

import java.util.Arrays;

public class SortArray {
    // Sort the input array, the array is assumed to
    // have values in {0, 1, 2}
    static void sort012(int a[], int arr_size)
    {
        int lo = 0;
        int hi = arr_size - 1;
        int mid = 0, temp = 0;
        // Iterate till all the elements
        // are sorted
        while (mid <= hi) {
            switch (a[mid]) {
                // If the element is 0
                case 0: {
                    temp = a[lo];
                    a[lo] = a[mid];
                    a[mid] = temp;
                    lo++;
                    mid++;
                    break;
                }
                // If the element is 1
                case 1:
                    mid++;
                    break;
                // If the element is 2
                case 2: {
                    temp = a[mid];
                    a[mid] = a[hi];
                    a[hi] = temp;
                    hi--;
                    break;
                }
            }
        }
    }

    /* Utility function to print array arr[] */

    static void printArray(int arr[], int arr_size)
    {
        int i;
        System.out.println("\n\n" + "After sorting the elements in the array are:");
        for (i = 0; i < arr_size; i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }

    /*Driver function to check for above functions*/
    public static void main(String[] args)
    {

        int arr[] = { 0, 1, 2, 2, 1, 0, 0, 2, 0, 1, 1 ,0 };
        int arr_size = arr.length;
        int max = 0;
        int n = (int)arr.length;
        System.out.println("The given array is :  ");
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            System.out.print(arr[i] + "  ");
        }
        sort012(arr, arr_size);
        printArray(arr, arr_size);
    }
}

