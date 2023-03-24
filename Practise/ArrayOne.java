import java.util.*;
public class ArrayOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        // for-each loop
        for(int num : arr) {
            System.out.println(num + " "); // here num represents element of arr
        }

        // arrays of objects
        String[] str = new String[4];
        for(int j=0; j<str.length; j++) {
            str[j] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "Yepp";
        System.out.println(Arrays.toString(str));
        sc.close();
    }
}
