package Methods;
import java.util.Arrays;
public class changeValue {
    public static void main(String[] args) {
        int arr[] = {12, 23, 45, 56, 68};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int nums[]) {
        nums[0] = 100;
    }
}
