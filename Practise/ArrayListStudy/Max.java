public class Max {
    public static void main(String[] args) {
        int[] arr = {10, 20, 60, 70, 65, 90, 40, 50};
        System.out.println(max(arr));
        System.out.println(maxRange(arr, 0, 4));
    }
    // Imagine that arr is not empty
    private static int max(int[] arr) {
        if(arr.length == 0) {
            return -1;
        }
        int max_val = arr[0];
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max_val) {
                max_val = arr[i];
            }
        }
        return max_val;
    }

    // Over a Range
    static int maxRange(int[] arr, int start, int end) {
        if(start > end) {
            return -1;
        }
        if(arr == null) {
            return -1;
        }
        int max_val = arr[start];
        for(int i=start; i<=end; i++) {
            if(arr[i] > max_val) {
                max_val = arr[i];
            }
        }
        return max_val;
    }
}
