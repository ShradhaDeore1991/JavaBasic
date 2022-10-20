/*77. Write a program in Java to generate a random permutation of array elements.
The given array is:
1 2 3 4 5 6 7 8
The shuffled elements in the array are:
2 8 7 3 4 5 1 6
 */

package array;

public class Permutation {
    //function to print the array
    void printarray(int arr[], int size)
    {
        int i,j;
        for(i=0; i<size; i++)
        {
            System.out.println("\t"+ arr[i]);
        }
        System.out.println("\n");
    }

    //function to swap the variables
    static void swap(int a, int b)
    {
        int temp;
        temp = a;
         a = b;
         b = temp;
    }

    //permutation function
    static void permutation(int arr, int n, int start, int end){
        int i = 0;
      /*  if(start==end)
        {
            printarray(arr[i], end+1);
            return;
        }*/

        for(i=start;i<=end;i++)
        {
            //swapping numbers
            swap((arr+i), (arr+start));
            //fixing one first digit
            //and calling permutation on
            //the rest of the digits
            permutation(arr, n,start+1, end);
            swap((arr+i), (arr+start));
        }
    }

public static void main(String [] args)
    {
        //taking input to the array
     //   int size;
     //   System.out.println("Enter the size of array\n");
     //   System.out.println(" "+ size);
     //   int i;
      //  int arr[size];
        int arr [] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        System.out.println("Given array::");
        for(int i=0;i<n;i++)

            System.out.print(" "+arr[i]);
        //calling permutation function
        //permutation(arr[n], 0, n-1);
    }
}
