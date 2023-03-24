import java.util.Arrays;
class TwoSum {
    public static void main(String[] args) {
        TwoSum mn = new TwoSum();
        int[] arr = {2,3,24,45};
        int[] result = mn.pairs(arr, 27);
        System.out.println(Arrays.toString(result));
    }

    // Two Sum
    public int[] pairs(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No solution found");
        
    }
}
