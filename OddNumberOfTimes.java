/*70. Write a program in Java to find two numbers that occur odd number of times in an array.
Output::
The given array is: 6 7 3 6 8 7 6 8 3 3
The two numbers occurring odd number of times are: 3 & 6
 */


package array;

public class OddNumberOfTimes {

    // function to find the element occurring odd
    // number of times
    static int getOddOccurrence(int arr[], int arr_size)
    {
        int i;
        for (i = 0; i < arr_size; i++) {
            int count = 0;
            for (int j = 0; j < arr_size; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                System.out.println("The two numbers occurring odd number of times are:");
                return arr[i];
        }
        return -1;
    }

    // driver code
    public static void main(String[] args)
    {
        int arr[] = new int[]{  6, 7, 3, 6, 8, 7, 6, 8, 3, 3 };
        int n = arr.length;

        //------------- print original array ------------------
        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
        //------------------------------------------------------
        System.out.println(getOddOccurrence(arr, n));
    }
}
