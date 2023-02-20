package inflearn.string;


import java.util.Scanner;

public class WordsInSentence3 {

    public static void main(String[] args) {
        WordsInSentence3 T = new WordsInSentence3();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "";
        int max=0;
        String[] word = str.split(" ");
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > max) {
                max = word[i].length();
                answer = word[i];
            }
        }
        return answer;
    }
}
