import java.util.Arrays;

public class PassingFunctions {
    public static void main(String[] args) {
        int[] nums = {4, 6, 8, 9};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] nums) {
        nums[0] = 2;
        nums[1] = 3;
    }
}
