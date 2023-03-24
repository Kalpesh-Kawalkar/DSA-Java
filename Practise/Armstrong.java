import java.util.*;
public class Armstrong {
    
public void isArmstrong(int n) {
    String s = Integer.toString(n);
    char[] ch = s.toCharArray();
    int size = s.length();
    int sum = 0;
    for (char num : ch) {
        int temp = 1;
        int i = Integer.parseInt(Character.toString(num));
        for(int j=0; j < size - 1; j++) {
            temp *= i;
        }
        sum += temp;
    }
    if(sum == n) {
        System.out.println("Given number is an armstrong number");
    }
    else {
        System.out.println("Given number is not an armstrong number");
    }
}

public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    //System.out.println("Enter the number : ");
    //int n = sc.nextInt();
    Armstrong obj = new Armstrong();
    obj.isArmstrong(153);
} 

}