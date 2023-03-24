import java.util.Arrays;
public class Duplicates {
    public static void main(String[] args) {
        Duplicates obj = new Duplicates();
        int[] arr = {2,8,5,9,8,6}; 
        boolean result = obj.isUnique(arr);
        System.out.println(result);
    }

    // isUnique method to find duplicates
    public boolean isUnique(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    boolean flag = false;
                    return flag;
                }
            }
        }
        return true;
    }
}