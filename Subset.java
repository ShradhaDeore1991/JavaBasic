/*55. Write a program in Java to check whether an array is subset of another array.
The given first array is : 4 8 7 11 6 9 5 0 2
The given second array is : 5 4 2 0 6
The second array is the subset of first array.
 */

package array;

public class Subset {

        // Function to check if an array is
        // subarray of another array
        static boolean isSubArray ( int A[], int B[],
        int n, int m)
        {
            // Two pointers to traverse the arrays
            int i = 0, j = 0;

            // Traverse both arrays simultaneously
            while (i < n && j < m) {

                // If element matches
                // increment both pointers
                if (A[i] == B[j]) {

                    i++;
                    j++;

                    // If array B is completely
                    // traversed
                    if (j == m)
                        return true;
                }

                // If not,
                // increment i and reset j
                else {
                    i = i - j + 1;
                    j = 0;
                }
            }
            return false;
        }

        // Driver Code
        public static void main (String arr[])
        {
            int A[] = {4, 8, 7, 11, 6, 9, 5, 0, 2};
            int n = A.length;

            int B[] = {5, 4, 2, 0, 6};
            int m = B.length;

            if (isSubArray(A, B, n, m))
                System.out.println("The second array is the subset of first array.");
            else
                System.out.println("The second array is not the subset of first array.");
        }
    }

