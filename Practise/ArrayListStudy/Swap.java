import java.util.*;
public class Swap {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        //swap(arr, 0, 4);
        Reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Reverse
    static void Reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        /*while(start < end) {
            // swap
            swap(arr, start, end);
            start++;
            end--;
        }*/
    }   
}