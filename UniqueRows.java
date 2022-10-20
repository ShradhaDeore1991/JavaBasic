/*72. Write a program in Java to return only the unique rows from a given binary matrix.
Output::
The given array is :
0 1 0 0 1
1 0 1 1 0
0 1 0 0 1
1 0 1 0 0
The unique rows of the given array are :
0 1 0 0 1
1 0 1 1 0
1 0 1 0 0
 */

package array;

public class UniqueRows {
    // method that prints all
// unique rows in a given matrix.
    public void printUniqueRows(int matrix[][], int row, int col)
    {
        // Traverse through the matrix
        for(int j = 0; j < row; j++)
        {
            // isUnique will get only two values, one is 0, and other is 1.
            // 0 means the row is not unique, and 1 means the row is unique

            int isUnqiue = 0;
            // Check whether there is a same column that is already displayed,
            // i.e if jth and ith column match.
            for(int i = 0; i < j; i++)
            {
                isUnqiue = 0;
                for(int k = 0; k < col; k++)
                {
                    if (matrix[j][k] != matrix[i][k])
                    {
                        isUnqiue = 1;
                    }
                }
                if (isUnqiue == 0)
                    break;
            }
            // If the row is unique,
            // or it is the first row
            if (isUnqiue == 1 || j == 0)
            {
                // display the row
                for(int p = 0; p < col; p++)
                {
                    System.out.print(matrix[j][p] + " ");
                }
                System.out.println();
            }
        }
    }
    // main method
    public static void main(String[] args)
    {
//creating an object of the class UniqueRowsMatrix
        UniqueRows obj = new UniqueRows();

// input binary matrix
        int matrix[][] = { { 0, 1, 0, 0, 1},
                           { 1, 0, 1, 1, 0},
                           {0, 1, 0, 0, 1},
                           {1, 0, 1, 0, 0}
        };

// row length of the matrix
        int row = matrix.length;

// column length of the matrix
        int col = matrix[0].length;
        System.out.println("For the following matrix: ");
        for(int i = 0; i < row; i++)
        {
            for(int j = 0; j < col; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The unique rows are: ");
        obj.printUniqueRows(matrix, row, col);
        System.out.println("\n");
        System.out.println();

    }
}


