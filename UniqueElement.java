/*73. Write a program in Java to print all unique elements of an unsorted array.
Output::
The given array is : 1 5 8 5 7 3 2 4 1 6 2
Unique Elements in the given array are:
1 5 8 7 3 2 4 6
 */

package array;

public class UniqueElement {
    public static void main (String[] args) {
        int arr[] = {1, 5, 8, 5, 7, 3, 2, 4, 1, 6, 2};
        int n = arr.length;
        int i, j;
        System.out.print("The given array is: ");
        for (i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.print("\nThe distinct elements of above array are: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;
            if (i == j)
                System.out.print( arr[i] + " ");
        }
    }

}
