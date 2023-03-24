public class PairsPrint {
    public static void main(String[] args) {
        PairsPrint obj = new PairsPrint();
        int[] customArray = {1,3,4,5};
        obj.PrintPairs(customArray);

    }
    void PrintPairs(int[] array) {
        for(int i=0; i<array.length; i++) {
            for (int j=0; j<array.length; j++) {
                System.out.println(array[i] + "" + array[j]);
            }
        }
    }
}