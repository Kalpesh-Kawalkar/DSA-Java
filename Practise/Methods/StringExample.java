package Methods;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
        // String message = greet();
        // System.out.println(message);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String naam = in.next();
        String personalized = myGreet(naam);
        System.out.println(personalized);
    }
    static String myGreet(String name) {
        String greeting = "Hello" +  " " + name;
        return greeting;
    }
    static String greet() {
        String greeting = "How are You ?";
        return greeting;
    }
}