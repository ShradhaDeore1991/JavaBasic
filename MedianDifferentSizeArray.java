/*71. Write a program in Java to find the median of two sorted arrays of different size.
Output::
The given first array is : 90 240 300
The given second array is : 10 13 14 20 25
The median of two different size arrays are : 22.500000
 */

package array;

import java.util.Arrays;

public class MedianDifferentSizeArray {
    public static void main(String[] args)
    {
        int arr1[] = { 90, 240, 300 };
        int n = arr1.length;
        //------------- print original array ------------------
        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        //------------------------------------------------------


        int arr2[] = { 10, 13, 14, 20, 25 };
        int m = arr2.length;
        //------------- print original array ------------------
        System.out.print("The given array is :  ");
        for(int i = 0; i < n; i++) {
            System.out.print(arr2[i] + "  ");
        }
        System.out.println();
        //------------------------------------------------------

        int[] arr3;
        arr3 = new int[n+m];
        for(int i=0; i<n; i++)
            arr3[i]=arr1[i];

        int j=n;
        for(int i=0; i<m; i++)
            arr3[j++]=arr2[i];

        Arrays.sort(arr3);

        float median;

        if((n+m)%2==0)
            median = (arr3[(n+m)/2] + arr3[(n+m)/2-1])/2;

        else
            median = arr3[(n+m)/2];

        System.out.println("The median of two different size arrays are :"+median);
    }
}

