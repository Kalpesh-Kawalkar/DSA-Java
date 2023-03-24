class DecimaltoBinary {
    public static void main(String[] args) {
        DecimaltoBinary obj = new DecimaltoBinary();
        var rec = obj.DectoBi(124);
        System.out.println(rec);
    }
    public int DectoBi(int n) {
        if(n==0) {
            return 0;
        }
        return n%2 + (10 * DectoBi(n/2));
    }
}