/*68. Write a program in Java to return maximum sum such that no two elements are adjacent.
Output::
The given array is : 1 3 5 9 7 10 1 10 100
The maximum sum from the array such that no two elements are adjacent is: 122
 */


package array;

public class Adjacent {
    public static int maxSumSubsequent(int[] arr1, int n) {
        int incl = arr1[0];
        int excl = 0;
        int exclNew;
        for(int i = 1; i < n; i++) {
            exclNew = incl > excl ? incl : excl;

            incl = excl + arr1[i];
            excl = exclNew;
        }
        return incl > excl ? incl : excl;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 9, 7, 10, 1, 10, 100};
        int n = (int)arr1.length;
        //------------- print original array ------------------	
        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        //------------------------------------------------------ 
        System.out.println("The maximum sum from the array such that no two elements are adjacent is: " + maxSumSubsequent(arr1, n) + " ");
    }

}
