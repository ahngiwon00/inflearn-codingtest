package inflearn.string;



import java.util.Scanner;

public class FindLetter1 {

    public static void main(String[] args) {
        FindLetter1 T = new FindLetter1();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(T.solution(str,c));
    }

    private int solution(String str, char c) {
        int answer= 0;
        str = str.toUpperCase();
        c = Character.toUpperCase(c);

        for(char x : str.toCharArray()){
            if(x==c){
                answer++;
            }
        }

        return answer;
    }


}
