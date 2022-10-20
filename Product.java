/*65. Write a program in Java to find the product of an array
such that product is equal to the product of all the elements of arr[] except arr[i].
The given array is : 1 2 3 4 5 6
Output::
The product array is: 720 360 240 180 144 120
 */

package array;

public class Product {
    public static void productOfArray(int[] arr1, int n) {
        int[] lArr = new int[n], rArr = new int[n], product = new int[n];
        lArr[0] = 1;
        rArr[n - 1] = 1;
        for(int i = 1; i < n; i++) {
            lArr[i] = arr1[i - 1] * lArr[i - 1];
        }
        for(int j = n - 2; j >= 0; j--) {
            rArr[j] = arr1[j + 1] * rArr[j + 1];
        }
        for(int i = 0; i < n; i++) {
            product[i] = lArr[i] * rArr[i];
        }
        for(int i = 0; i < n; i++) {
            System.out.print(product[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int n = (int)arr1.length;
        //------------- print original array ------------------
        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        //------------------------------------------------------

        System.out.print("The product array is: ");
        productOfArray(arr1, n);
    }

}