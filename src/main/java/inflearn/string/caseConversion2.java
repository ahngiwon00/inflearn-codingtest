package inflearn.string;

import java.util.Scanner;


public class caseConversion2 {

    public static void main(String[] args) {
        caseConversion2 T = new caseConversion2();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer="";
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(Character.isLowerCase(c[i])){
                answer += Character.toUpperCase(c[i]);
            }
            else{
                answer += Character.toLowerCase(c[i]);
            }
        }
        return answer;
    }

}
