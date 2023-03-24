import java.util.*;
public class MaxProduct {
    public static void main(String[] args) {
        MaxProduct obj = new MaxProduct();
        int[] nums = {10,20,30,40,50};
        String result = obj.maxProduct(nums);
        System.out.println(result);
    }
    // Max Product
    public String maxProduct(int[] nums) {
        int maxProduct = 0;
        String pairs = "";
        for(int i=0; i<nums.length; i++) {
            for (int j=i+1; j<nums.length; j++) {
                if(nums[i]*nums[j] > maxProduct) {
                    maxProduct = nums[i] * nums[j];
                    pairs = Integer.toString(nums[i]) + "," + Integer.toString(nums[j]);
                }
            }
        }
        return pairs;
    }
}