import java.util.Arrays;
public class Main2dArray {
    public static void main(String[] args) {
        //Declare
        int[][] int2darr;

        //Instantiate
        int2darr = new int[2][2];

        //Initialize
        int2darr[0][0] = 1;
        int2darr[0][1] = 2;
        int2darr[1][0] = 3;
        int2darr[1][1] = 4;
        
        System.out.println(Arrays.deepToString(int2darr));

        //All together
        String s2DArray[][] = {{"a","b"}, {"c","d"}};
        System.out.println(Arrays.deepToString(s2DArray));

        TwoDimensionalArray sda = new TwoDimensionalArray(2, 2);
        sda.insertValue(0, 0, 10);
        sda.insertValue(0, 1, 20);
        sda.insertValue(1, 0, 30);
        sda.insertValue(1, 1, 40);
        sda.accessCell(0, 1);
        sda.traverse2DArray();
        sda.searchArray(40);

        System.out.println(Arrays.deepToString(sda.arr));
        sda.deleteArray(0, 1);
        System.out.println(Arrays.deepToString(sda.arr));
    }
}