package inflearn.string;
import java.util.ArrayList;
import java.util.Scanner;


public class flipWord4 {
    public static void main(String[] args) {
        flipWord4 T = new flipWord4();
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
