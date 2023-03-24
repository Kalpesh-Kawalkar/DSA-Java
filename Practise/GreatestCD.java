class GreatestCD {
    public static void main(String[] args) {
        GreatestCD obj = new GreatestCD();
        var rec = obj.GCD(18, 9);
        System.out.println(rec);
    }
    public int GCD(int a, int b) {
        if(b==0) {
            return a;
        }
        if(a < 0 || b < 0) {
            return -1;
        }
        return GCD(a, a%b);
    }
}