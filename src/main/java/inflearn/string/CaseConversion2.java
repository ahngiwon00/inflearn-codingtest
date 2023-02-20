package inflearn.string;

import java.util.Scanner;


public class CaseConversion2 {

    public static void main(String[] args) {
        CaseConversion2 T = new CaseConversion2();
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
