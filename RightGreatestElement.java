/*63. Write a program in Java to replace every element with the greatest element on its right side.
The given array is : 7 5 8 9 6 8 5 7 4 6
After replace the modified array is: 9 9 9 8 8 7 7 6 6 0
 */


package array;

public class RightGreatestElement {

        public static void printArray(int[] a, int n) {
            for(int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
        }

        public static void replaceWithNextGreatest(int[] a, int size) {
            int maximum = a[size - 1];
            a[size - 1] = 0;
            for(int i = size - 2; i >= 0; i--) {
                int temp = a[i];
                a[i] = maximum;
                if(maximum < temp) {
                    maximum = temp;
                }
            }
            System.out.print("After replace the modified array is: ");
            printArray(a, size);
        }

        public static void main(String[] args) {
            int[] arr1 = {7, 5, 8, 9, 6, 8, 5, 7, 4, 6};
            int n = (int)arr1.length;
            //------------- print original array ------------------
            System.out.print("The given array is :  ");
            for(int i = 0; i < n; i++) {
                System.out.print(arr1[i] + "  ");
            }
            System.out.println();
            //------------------------------------------------------
            replaceWithNextGreatest(arr1, n);
        }
    }

