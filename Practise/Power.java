class Power {
    public static void main(String[] args) {
        Power obj = new Power();
        var rec = obj.power(4, 2);
        System.out.println(rec);
    }
    public int power(int base, int exp) {
        if(exp==0){
            return 1;
        }
        if(exp<0) {
            return -1;
        }
        return base * power(base, exp-1);
    }
}
