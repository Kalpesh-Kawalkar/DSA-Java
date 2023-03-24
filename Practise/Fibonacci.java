/*class Fibonacci {
    public static void main(String[] args) {
        Fibonacci rec = new Fibonacci();
        var recursion = rec.fib(7);
        System.out.println(recursion);
    }
    public int fib(int n) {
        if (n==0 || n==1) {
            return n;
        }
        else {
            return fib(n-2) + fib(n-1);
        }
    }
}
*/
import java.util.*;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;
    while(count <= n) {
        int temp = i;
        i = i + p;
        p = temp;
        count++;
    }
    System.out.println(i);
}
}