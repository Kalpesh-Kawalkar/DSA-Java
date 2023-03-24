import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Operator : ");
        char opr = in.next().trim().charAt(0);
        int ans = 0;
        while(true) {
            if (opr == '+' || opr == '-' || opr == '*' || opr == '/' || opr == '%') {
                System.out.println("Enter two numbers : ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
    
                if(opr == '+') {
                    ans = num1 + num2;
                    System.out.println(ans);
                }
                else if(opr == '-') {
                    ans = num1 - num2;
                }
                else if(opr == '/') {
                    if(num2 != 0) {
                        ans = num1 / num2;
                    }
                    else {
                        System.out.println("Division by 0 is not possible");
                    }
                }
                else if(opr == '%') {
                    ans = num1 % num2;
                }
            }
            else if(opr == 'x' || opr == 'X') {
                break;
            }
            else {
                System.out.println("Invalid Operator !");
            }
        }
        System.out.println(ans);
    }
}
