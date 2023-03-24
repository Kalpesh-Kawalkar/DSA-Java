import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String dept = in.next();

        switch (empId) {
            case 001:
                System.out.println("Kunal");
                break;
            case 002:
                System.out.println("Kalpesh");
                break;
            case 003:
                System.out.println("Karuna");
                break;
            case 004:
                switch (dept) {
                    case "IT":
                        System.out.println("IT dept");
                        break;
                    case "Management":
                        System.out.println("Management");
                        break;
                    default:
                        break;
                }
                break;
        
            default:
                break;
        }
    }
}