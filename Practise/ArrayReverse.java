import java.util.Arrays;

public class ArrayReverse {
   public static void main(String[] args) {
    ArrayReverse obj = new ArrayReverse();
    int [] customArray = {1,3,4,5};
    obj.Reverse(customArray);

   } 
   void Reverse(int[] array) {
    for(int i = 0; i<array.length/2; i++) {
        int other = array.length-i-1;
        int temp = array[i];
        array[i] = array[other];
        array[other] = temp;
    }
    System.out.println(Arrays.toString(array));
   }
}