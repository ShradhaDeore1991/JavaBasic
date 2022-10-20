/*66. Write a program in Java to count the number of inversion in a given array.
Output::
The given array is : 1 9 6 4 5
The inversions are: (9, 6) (9, 4) (9, 5) (6, 4) (6, 5)
The number of inversion can be formed from the array is: 5
 */

package array;

public class Inversion {
    static int arr[] = new int[] { 1, 20, 6, 4, 5 };

    static int getInvCount(int n)
    {
        int inv_count = 0;
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    inv_count++;

        return inv_count;
    }

    // Driver method to test the above function
    public static void main(String[] args)
    {
        System.out.println("Number of inversions are :: "
                + getInvCount(arr.length));
    }

}
