/*75. Write a program in Java to find the sum of lower triangular elements of a matrix.
Output::
The given array is :
1 2 3
4 5 6
7 8 9
The elements being summed of the upper triangular matrix are: 4 7 8
The Sum of the upper triangular Matrix Elements are: 19
 */

package array;

public class LowerElement {
    public static void main(String[] args) {
        int R, C, n, r, c, sum = 0;
        int arr1[ ][]={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        } ;
        R = C = n = 3;
        int i, j;
        //------------- print original array ------------------
        System.out.println("The given array is :  \n");
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                System.out.print(arr1[i][j] +" ");
            }
            System.out.println("\n");
        }
//------------------------------------------------------
        System.out.print("The elements being summed of the upper triangular matrix are: " +" ");
        for (r = 0; r < R; r++) {
            for (c = 0; c < C; c++) {
                if (r > c) {
                    System.out.print(" "+ arr1[r][c]);
                    sum += arr1[r][c];
                }
            }
        }

        System.out.println("\nThe Sum of the upper triangular Matrix Elements are: "+ sum);
        // return 0;
    }

}
