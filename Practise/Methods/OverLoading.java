package Methods;
public class OverLoading {
    public static void main(String[] args) {
        fun("Anurag");
        fun(67);
    }
    // Function Overloading : Two or more functions with the same name and different parameters
    // Occurs at Compile Time
    static void fun(int num) {
        System.out.println(num);
    }
    static void fun(String str) {
        System.out.println(str);
    }
    static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b, int c) {
        return a + b + c;
    }
}