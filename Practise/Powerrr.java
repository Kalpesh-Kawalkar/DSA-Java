class Powerrr {
    public static void main(String[] args) {
        Powerrr obj = new Powerrr();
        var rec = obj.myPow(1.50, 2);
        System.out.println(rec);
    }
    public double myPow(double x, int n) {
        if(n==0) {
          return 1;
        }
        if(n<0) {
          return (1 / (x * myPow(x, -n-1)));
        }
        return (x * myPow(x, n-1));
        }
    }