package LinearSearchEx;

import java.util.Arrays;

public class Searchin2DArray {
    public static void main(String[] args) {
        int[][] nums = {{1,2,4,5}, {34,56,78,90}, {35,67,88,12}, 
                      {14,27,75,87,90}};
        int target = 56;
        int[] ans = search(nums, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(searchMax(nums));
        System.out.println(Integer.MIN_VALUE);
    }

    static int[] search(int[][] arr, int target) {
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] == target) {
                    return new int[]{i,j};
                }
            }
            return new int[]{-1,-1};
        }
    }

    static int searchMax(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if(arr[i][j] == max) {
                    max = arr[i][j];
                }
            }
        }
        return max;
    }
}