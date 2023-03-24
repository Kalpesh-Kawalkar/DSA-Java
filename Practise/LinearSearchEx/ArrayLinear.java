package LinearSearchEx;

public class ArrayLinear {
    public static void main(String[] args) {
        int[] nums = {30, -5, 23, 45, 69, -23, -50, 89};
        int target = 69;
        int ans = linearsearch(nums, 69);
        System.out.println("Element found at index: " + ans);
    }
    static int linearsearch(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }
        for(int i=0; i<arr.length; i++) {
            int element = arr[i];
            if(element == target) {
                return i;
            }
        }
        return -1;
    } 


    static int linearsearch2(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }
        for(int element : arr) {
            if(element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target is not found
        return Integer.MAX_VALUE;
    } 

    // search the target and return true or false
    static boolean linearsearch3(int[] arr, int target) {
        if(arr.length == 0) {
            return false;
        }
        for(int element : arr) {
            if(element == target) {
                return true;
            }
        }
        return false;
    } 
    
}
