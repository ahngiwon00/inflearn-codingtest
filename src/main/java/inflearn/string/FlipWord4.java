package inflearn.string;
import java.util.ArrayList;
import java.util.Scanner;


public class FlipWord4 {
    public static void main(String[] args) {
        FlipWord4 T = new FlipWord4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        for(String x : T.solution(n,str)){
            System.out.println(x);
        }
    }

    private ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        for(String x : str){
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }

        return answer;
    }
}
