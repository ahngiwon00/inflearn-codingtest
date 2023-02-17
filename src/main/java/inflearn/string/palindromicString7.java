package inflearn.string;


import java.util.Scanner;

public class palindromicString7 {

    public static void main(String[] args) {
        palindromicString7 T = new palindromicString7();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase();
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) {
            answer = "YES";
        }
        System.out.println(str);
        System.out.println(tmp);

        return answer;
    }
}
