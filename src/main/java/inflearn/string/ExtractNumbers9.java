package inflearn.string;


import java.util.Scanner;

public class ExtractNumbers9 {

    public static void main(String[] args) {
        ExtractNumbers9 T = new ExtractNumbers9();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

    private int solution(String str) {
        int answer=0;
        for (char x : str.toCharArray()) {
            if (x >= 48 && x < 58) {
                answer = answer * 10 + (x - 48);
            }
        }

        return answer;
    }
}
