package inflearn.string;


import java.util.Scanner;

public class AvailablePalindrome8 {

    public static void main(String[] args) {
        AvailablePalindrome8 T = new AvailablePalindrome8();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) {
            answer = "YES";
        }
        System.out.println(str);
        System.out.println(tmp);

        return answer;
    }
}
