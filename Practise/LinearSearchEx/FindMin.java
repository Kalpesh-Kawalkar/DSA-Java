package LinearSearchEx;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {40, 60, 10, 20, 50};
        System.out.println(min(arr));
    }

    static int min(int[] arr) {
        int min = arr[0];
        if(arr.length == 0) {
            return -1;
        }
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}