package inflearn.string;


import java.util.Scanner;

public class StringCompression11 {

    public static void main(String[] args) {
        StringCompression11 T = new StringCompression11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }

    private String solution(String str) {
        String answer = "";
        str = str + " ";
        int cnt=1;
        for(int i=0; i<str.length()-1; i++){
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += String.valueOf(cnt);
                    cnt=1;
                }
            }
        }
        return answer;
    }
}
