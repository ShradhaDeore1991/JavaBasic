/*53. Write a program in Java to find the number of times (frequency) occurs a given number in an array.
The given array is : 2 3 4 4 4 4 5 5 5 6 7 7
The number of times the number 4 occurs in the given array is: 4
 */

package array;

public class Frequency {
    public static void main(String[] args) {
        int [] arr = {2, 3, 4, 4, 4, 4, 5, 5, 5,6,7,7};
        int max = 0;
        int n = (int)arr.length;
        System.out.println("The given array is :  ");
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
            System.out.print(arr[i] + "  ");
        }
        //Array for will store frequencies of element
        int [] fr = new int [arr.length];
        int visited = -1;
        for(int i = 0; i < arr.length; i++){
            int count = 1;
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    count++;
                    //To avoid counting same element again
                    fr[j] = visited;
                }
            }
            if(fr[i] != visited)
                fr[i] = count;
        }
        //Displays the frequency of each element present in array
        int i = 0;
        System.out.println("\n"+" The number of times the number :: ");
        for(; i < fr.length; i++) {
            if (fr[i] != visited)
                System.out.println(" The number of times the number " + arr[i] + " occurs in the given array is: " + fr[i]);

        }
    }
}
