/*76. Write a program in Java to find the largest number possible from the set of given numbers.
Output::
The given numbers are :
15 628 971 9 2143 12
The largest possible number by the given numbers are: 997162821431512
 */

package array;

import java.util.Arrays;

public class PossibleLargestNumber {

    public static int compare(String aArg, String bArg) {
        String[] a = {aArg};
        String[] b = {bArg};
        String[] x = a;
        String[] y = b;

        int chrLen = x[0].length() + y[0].length() + 1;

        String xy = new String(String.valueOf(chrLen));
        xy.concat("" + x[0] + y[0]);

        String yx = new String(String.valueOf(chrLen));
        yx.concat("" + y[0] + x[0]);

        return yx.compareTo(xy);
    }

    public static void main(String[] args) {
        int [] arr1 = {15, 628, 971, 9,2143, 12};
        int n = arr1.length;
        //------------- print original array ------------------
        System.out.println("The given numbers are :  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        //------------------------------------------------------
        Arrays.sort(arr1, 0, n);
        System.out.print("The largest possible number by the given numbers are: ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i]);
        }
    }
}


