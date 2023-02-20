package inflearn.array;


import java.util.Scanner;

public class RockPaperScissors3 {

    public static void main(String[] args) {
        RockPaperScissors3 T = new RockPaperScissors3();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        for (int i = 0; i < n; i++) {
            arrA[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arrB[i] = sc.nextInt();
        }
        for (char x : T.solution(n, arrA, arrB).toCharArray()) {
            System.out.println(x);
        }
    }

    private String solution(int n,int[] arrA,int[] arrB) {
        String answer="";
        for (int i = 0; i < n; i++) {
            if ((arrA[i] == 1 && arrB[i] == 3) || (arrA[i] == 2 && arrB[i] == 1) || (arrA[i] == 3 && arrB[i] == 2)) {
                answer += "A";
            } else if ((arrA[i] == 1 && arrB[i] == 1) || (arrA[i] == 2 && arrB[i] == 2) || (arrA[i] == 3 && arrB[i] == 3)) {
                answer += "D";
            } else {
                answer += "B";
            }
        }
        return answer;
    }
}
