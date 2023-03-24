import java.util.Arrays;
import java.util.Collections;
class BestScore {
    public static void main(String[] args) {
        //BestScore obj = new BestScore();
        Integer[] arr = {4, 10, 29, 30};
        String a = BestScore.bestScore(arr);
        System.out.println(a);
    }

    static String bestScore(Integer[] arr) {
        Integer[] myarr = arr;
        Arrays.sort(myarr, Collections.reverseOrder());
        int first = 0;
        int second = 0;
        for(int i = 0; i<myarr.length; i++) {
            if(myarr[i] != first) {
                second = myarr[i];
                break;
            }
        }
        return first + " " + second;
    }
}
