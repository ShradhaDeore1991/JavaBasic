/*56. Write a program in Java to return the minimum number of jumps to reach the end of the array.
The given array is : 1 3 5 8 9 2 6 7 6 8 9 1 1 1
The minimum of number of jumps is required to reach the end is: 3
 */

package array;

public class MinimumJumps {
    // Returns minimum number of jumps
    // to reach arr[n-1] from arr[0]
    static int minJumps(int arr[], int n)
    {

        // The number of jumps needed to
        // reach the starting index is 0
        if (n <= 1)
            return 0;

        // Return -1 if not possible to jump
        if (arr[0] == 0)
            return -1;

        // Stores the number of jumps
        // necessary to reach that maximal
        // reachable position.
        int jump = 1;

        // Stores the subarray last index
        int subArrEndIndex = arr[0];

        int i = 1;

        // Maximum steps covers in
        // first half of sub array
        int subArrFistHalfMaxSteps = 0;

        // Maximum steps covers
        // in second half of sub array
        int subArrSecondHalfMaxSteps = 0;

        // Start traversing array
        for (i = 1; i < n;) {

            subArrEndIndex = i + subArrEndIndex;

            // Check if we have reached
            // the end of the array
            if (subArrEndIndex >= n)
                return jump;

            int firstHalfMaxStepIndex = 0;

            // Iterate the sub array
            // and find out the maxsteps
            // cover index
            for (; i < subArrEndIndex; i++) {
                int stepsCanCover = arr[i] + i;
                if (subArrFistHalfMaxSteps
                        < stepsCanCover) {
                    subArrFistHalfMaxSteps = stepsCanCover;
                    subArrSecondHalfMaxSteps = 0;
                    firstHalfMaxStepIndex = i;
                }
                else if (subArrSecondHalfMaxSteps
                        < stepsCanCover) {
                    subArrSecondHalfMaxSteps
                            = stepsCanCover;
                }
            }
            if (i > subArrFistHalfMaxSteps)
                return -1;
            jump++;

            // Next subarray end index
            // and so far calculated sub
            // array max step cover value
            subArrEndIndex = arr[firstHalfMaxStepIndex];
            subArrFistHalfMaxSteps
                    = subArrSecondHalfMaxSteps;
        }

        return -1;
    }

    // Driver program to test above function
    public static void main(String[] args)
    {

        int arr[] = { 1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9 };
        int size = arr.length;
        int max = 0;
        int n = (int)arr.length;
        System.out.println("The given array is :  ");
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            System.out.print(arr[i] + "  ");
        }
        // Calling the minJumps function
        System.out.println("\n"+
                "Minimum number of jumps to reach end is ::  "
                        + minJumps(arr, size));
    }
}
