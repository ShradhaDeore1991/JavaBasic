/*67. Write a program in Java to search an element in a row wise and column wise sorted matrix.
Output::
The given array in matrix form is :
15 23 31 39
18 26 36 43
25 28 37 48
30 34 39 50
 */


package array;

import java.util.Scanner;

public class SearchElement {
  //  static int R = 4 ;
   // static int C  = 4 ;

    private static int[] search(int[][] matrix, int target,int numRows,int numCols) {
        if (matrix.length == 0) {  // If there are no elements in the matrix return -1
            return new int[]{-1, -1};
        }



        int i = 0; // Loop invariable for the row
        int j = numCols - 1; // Loop invariable for the column

        while (i >= 0 && i < numRows && j >= 0 && j < numCols) {
            if (target == matrix[i][j])  return new int[]{i, j};
            else if (target < matrix[i][j])  j--;
            else i++;
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {15, 23, 31, 39},
                {18, 26, 36, 43},
                {25, 28, 37, 48},
                {30, 34, 39, 50}

                };

        int numRows = matrix.length;
        int numCols = matrix[0].length;

       //------------- print original matrix ------------------
        System.out.println("The given matrix is :");
        for(int i = 0; i < numRows; i++)
        {
            for (int j=0;j < numCols;j++)
            {
                System.out.print(matrix[i][j]+" " );
            }
            System.out.println(" ");
        }
//------------------------------------------------------

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number you want to search.....");
        int target = scanner.nextInt();

        int[] result = search(matrix, target, numRows,numCols);

        if(result[0] != -1 && result[1] != -1) {
            System.out.println(target + " found at row - " + (result[0] + 1) + " and column - " + (result[1] + 1));
        } else {
            System.out.println(target + " not found in the matrix");
        }
    }

}
