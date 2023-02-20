package inflearn.string;


import java.util.Scanner;

public class PalindromicString7 {

    public static void main(String[] args) {
        PalindromicString7 T = new PalindromicString7();
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
