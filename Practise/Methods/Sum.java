package Methods;

import java.util.Scanner;

public class Sum {
    public static void main(StringExample[] args) {
        //SumofTwo();
        //int ans = SumTwo();
        int ans = Sum3(6,7);
        System.out.println("The sum is: " + ans);
    }

    // pass two parameters
    static int Sum3(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    // return the value
    static void SumofTwo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = in.nextInt();
        System.out.println("Enter second number: ");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        System.out.println("The Sum is: " + sum);
    }
    static int SumTwo() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int n1 = in.nextInt();
        System.out.println("Enter second number: ");
        int n2 = in.nextInt();
        int sum = n1 + n2;
        return sum;
    }
}