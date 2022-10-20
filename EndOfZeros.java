/*58. Write a program in Java to move all zeroes to the end of a given array.
The given array is : 2 5 7 0 4 0 7 -5 8 0
The new array is:
2 5 7 8 4 -5 7 0 0 0
 */
package array;

public class EndOfZeros {
    // function to move all zeroes at
// the end of array
    static void moveZerosToEnd(int arr[], int n) {

        // Count of non-zero elements
        int count = 0;

        // Traverse the array. If arr[i] is non-zero, then
        // update the value of arr at index count to arr[i]
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i];

        // Update all elements at index >=count with value 0
        for (int i = count; i<n;i++)
            arr[i]=0;
    }

    // function to print the array elements
    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }

    // Driver program to test above
    public static void main(String args[]) {
        int arr[] = {2, 5, 7, 0, 4, 0, 7,-5, 8, 0 };
        int n = arr.length;

        System.out.print("Original array: ");
        printArray(arr, n);

        moveZerosToEnd(arr, n);

        System.out.print("\nModified array: ");
        printArray(arr, n);
    }
}
