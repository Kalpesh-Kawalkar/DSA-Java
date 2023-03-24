import java.util.*;
public class FruitSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //String fruit = in.next();

        // switch (fruit) {
        //     case "Mango":
        //         System.out.println("King of Fruits");
        //         break;
        //     case "Apple":
        //         System.out.println("A sweet red fruit !");
        //         break;
        //     case "Orange":
        //         System.out.println("Nagpur Cha Fruit");
        //         break;
        //     case "Grapes":
        //         System.out.println("A small fruit !");
        //         break;
        //     default:
        //         System.out.println("Please enter a valid fruit !");
        // }
        /*if(fruit.equals("mango")) {
            System.out.println("King Of Fruits")
        }
        if(fruit.equals("apple")) {
            System.out.println("A sweet fruit")
        }*/
        int day = in.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid input !");
                break;

            // switch (day) {
            //     case 1,2,3,4,5 -> System.out.println("Weekday");
            //     case 6,7 -> System.out.println("Weekend");
            // }
        }
    }
}