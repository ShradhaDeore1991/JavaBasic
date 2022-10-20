  /*59. Write a program in Java to return the counting sort on an array.
The given array is : 4 14 8 0 2 5 2 1 0 17 9 0 5
After sorting the elements in the array are: 0 0 0 1 2 2 4 5 5 8 9 14 17
 */

package array;

public class CountingSort {
    public static void countingSort(int[] arr1, int n, int max) {
        int[] count = new int[50];
        for(int i = 0; i < n; ++i) {
            count[arr1[i]] = count[arr1[i]] + 1;
        }
        System.out.print("After sorting the elements in the array are:  ");
        for(int i = 0; i <= max; ++i) {
            for(int j = 1; j <= count[i]; ++j) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int max = 0;
        int[] arr1 = {4, 14, 8, 0, 2, 5, 2, 1, 0, 17, 9, 0, 5};
        int n = (int)arr1.length;
        //------------- print original array ------------------
        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            if(arr1[i] > max) {
                max = arr1[i];
            }
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        //------------------------------------------------------
        countingSort(arr1, n, max);
    }

}
