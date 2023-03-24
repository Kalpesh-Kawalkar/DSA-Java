package LinearSearchEx;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896, 68};
        //System.out.println(findNumbers(nums));
        System.out.println(digits(-7896));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if(even(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
    static int even(int num) {
        if(num < 0) {
            // making it positive
            num *= -1;
        }
        int numOfDigits = digits(num);
        /*if(numOfDigits % 2 == 0) {
            return true;
        }
        return false;*/
        return numOfDigits % 2 == 0;
    }
    // count number of digits in a number
    static int digits(int num) {
        int count = 0;
        while(num > 0) {
            count++;
            num /= 10;
        }
        // return (int)(Math.log10(num)) + 1;
        return count;
    }

}
