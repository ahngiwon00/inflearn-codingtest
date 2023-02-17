package inflearn.string;


import java.util.Scanner;

public class shortestTextDistance10 {

    public static void main(String[] args) {
        shortestTextDistance10 T = new shortestTextDistance10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for (int x : T.solution(str, c)) {
            System.out.print(x+" ");
        }
    }

    private int[] solution(String str, char c) {

        int[] answer = new int[str.length()];
        int p = 500;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                p = 0;
                answer[i]=p;
            } else {
                p++;
                answer[i]=p;
            }
        }
        p = 500;
        for (int i = str.length()-1; i >=0;  i--) {
            if (str.charAt(i) == c) {
                p = 0;
                answer[i]=p;
            } else{
                if (answer[i] > p) {
                    p++;
                    answer[i]=p;
                }
            }
        }

        return answer;
    }
}
