import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Syntax
        ArrayList<Integer> list = new ArrayList<Integer>();
       /*  list.add(67);
        list.add(56);
        list.add(57);
        list.add(78);
        list.add(90);
        System.out.println(list.contains(67));
        System.out.println(list.contains(456));
        System.out.println(list); */
        System.out.println(list.set(2, 99));
        System.out.println(list);
        list.remove(2);
        System.out.println(list);

        //Input
        for(int i=0; i<5; i++) {
            list.add(sc.nextInt());
        }

        //Output
        for(int i=0; i<5; i++) {
            System.out.println(list.get(i));;
        }
        System.out.println(list);
    }
}
