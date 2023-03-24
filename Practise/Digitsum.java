class Digitsum {
    public static void main(String[] args) {
    Digitsum obj = new Digitsum();
    var rec = obj.SumofDigits(124);
    System.out.println(rec);
    }
    public int SumofDigits (int n){
        if(n<=0){
          return 0;
        }
        return n%10 + SumofDigits(n/10);
    }
}