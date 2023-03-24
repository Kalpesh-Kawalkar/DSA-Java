class SumandProduct {
    public static void main(String[] args) {
        SumandProduct obj = new SumandProduct();
        int[] custArray = {1,3,4,5};
        obj.SumProduct(custArray);
    }
        
    void SumProduct(int[] array) {
        int sum = 0;
        int product = 1;
        for(int i=0; i<array.length; i++) {
            sum += array[i];
        }
        for(int i=0; i<array.length; i++) {
            product *= array[i];
        }
        System.out.println(sum + "," + product);
    }
}
