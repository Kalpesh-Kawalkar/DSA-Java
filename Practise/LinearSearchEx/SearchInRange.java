package LinearSearchEx;

public class SearchInRange {
    int[] nums = {34, 56, 78, 68, 69, 90};
    int target = 68;
    System.out.println(linearsearch(nums, target, 0, 4))
}

static int linearsearch(int[] arr, int target, int start, int end) {
    if(arr.length == 0) {
        return -1;
    }
    for(int i=start; i<=end; i++) {
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