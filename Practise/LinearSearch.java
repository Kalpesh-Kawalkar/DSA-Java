import java.util.Arrays;
public class LinearSearch {
    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();
        int[] nums = {1,2,3,4,5};
        obj.linearSearch(nums, 5);
    }
    public void linearSearch(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                System.out.println("The value is found at the index of " + i);
            }
        }
    }
}