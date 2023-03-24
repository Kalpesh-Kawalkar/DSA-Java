import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
           1 3 4
           4 6 9
           1 5 4
         */
     //   int[][] arr = new int[3][];
     //   int[][] arr = {{1,3,4}, {4,6,9}, {1,5,4}};
     Scanner sc = new Scanner(System.in);
     int[][] arr = new int[3][3];

     // Input
     for(int row=0; row<arr.length; row++) {
        for(int col=0; col<arr[row].length; col++) {
            arr[row][col] = sc.nextInt();
        }
     }

        // Output
        //for(int row=0; row<arr.length; row++) {
        //    System.out.println(Arrays.toString(arr[row]));
        // }

    // Output
    for (int[] a : arr) {
        System.out.println(Arrays.toString(a));
    }
    }
}