public class MainsArrays {
    public static void main(String[] args) {
        SingleDimensionArray sda = new SingleDimensionArray(10);
        sda.insert(0, 10);
        sda.insert(1, 20);
        sda.insert(2, 30);
        sda.insert(3, 40);
        sda.insert(6, 50);
        sda.insert(11, 70);

       /*var firstElement = sda.arr[0];
        System.out.println(firstElement);
        var ThirdElement = sda.arr[3];
        System.out.println(ThirdElement);
        var EleventhElement = sda.arr[11];
        System.out.println(EleventhElement); */

        //System.out.println("Array Traversal");
        //sda.traverseArray();

        //sda.searchinArray(90);

        sda.deleteArrayValue(0);
        System.out.println(sda.arr[0]);
    }
}