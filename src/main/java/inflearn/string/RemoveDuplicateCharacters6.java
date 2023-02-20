package inflearn.string;


import java.util.Scanner;

public class RemoveDuplicateCharacters6 {

    public static void main(String[] args) {
        RemoveDuplicateCharacters6 T = new RemoveDuplicateCharacters6();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }
}
