package Methods;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

    // swap numbers
    int temp = a;
    a = b;
    b = temp;

    swap(56,67);
    System.out.println(a + " " + b);
    }

    // swap method
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
