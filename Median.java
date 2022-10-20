/*64. Write a program in Java to find the median of two sorted arrays of same size.
The given array - 1 is : 1 5 13 24 35
The given array - 2 is : 3 8 15 17 32
output::
The Median of the 2 sorted arrays is: 14
 */

package array;

import java.util.Arrays;
import java.util.Scanner;

public class Median {

        static int findMedian(int a1[],
        int a2[], int n) {
        /*
        i will point to the current index of the first array and j will point the
         current index of the second array
        */
            int i = 0;
            int j = 0;

        /*
        a counter that counts the elements till the counter reaches n when the counter reaches n elements it means we have reached the median of the two arrays
        */
            int count;
            int firstMedian = -1, secondMedian = -1;

            for (count = 0; count <= n; count++) {

            /*
            when all elements of a1[] are smaller than smallest than the first element of a2[]
            */
                if (i == n) {
                    firstMedian = secondMedian;
                    secondMedian = a2[0];
                    break;
                }
            /*
            when all elements of a2[] are smaller than smallest than the first element of a1[]
            */
                else if (j == n) {
                    firstMedian = secondMedian;
                    secondMedian = a1[0];
                    break;
                }

                if (a1[i] <= a2[j]) {
                    firstMedian = secondMedian;
                    secondMedian = a1[i];
                    i++;
                } else {
                    firstMedian = secondMedian;
                    secondMedian = a2[j];
                    j++;
                }
            }

            return (firstMedian + secondMedian) / 2;
        }

        public static void main(String args[]) {
            int a1[] = {1, 5, 13, 24, 35};
            int n = (int)a1.length;
            int max = 0;
            System.out.print("The given array1 is :  ");
            for(int i = 0; i < n; i++) {
                if(a1[i] > max ) {
                    max = a1[i];
                }
                System.out.print(a1[i] + "  ");
            }
            int a2[] = {3, 8, 15, 17, 32};
            System.out.print("\n"+"The given array2 is :  ");
            for(int i = 0; i < n; i++) {
                if(a2[i] > max ) {
                    max = a2[i];
                }
                System.out.print(a2[i] + "  ");
            }

            System.out.println("\n"+"The median of two sorted arrays is: " + findMedian(a1, a2, a1.length));
        }

   }
