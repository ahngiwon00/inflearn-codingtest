package inflearn.string;


import java.util.Scanner;

public class FlipSpecificCharacter5 {

    public static void main(String[] args) {
        FlipSpecificCharacter5 T = new FlipSpecificCharacter5();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "";
        char[] c = str.toCharArray();
        int first=0;
        int end = c.length - 1;
        char tmp;

        while (first < end) {
            if (!Character.isAlphabetic(c[first]) || !Character.isAlphabetic(c[end])) {
                first++;
                end--;
            } else {
                tmp=c[first];
                c[first] = c[end];
                c[end]= tmp;
                first++;
                end--;
            }
        }

        answer = String.valueOf(c);

        return answer;
    }
}
