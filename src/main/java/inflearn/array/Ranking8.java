package inflearn.array;


import java.util.Scanner;

public class Ranking8 {

    private int[] solution(int n,int[] arr) {
        int[] answer = new int[n];

        for (int i = 0; i < n; i++) {
            int max =1;
            for (int j = 0; j < n; j++) {
                if (arr[i] < arr[j]) {
                    max++;
                }
            }
            answer[i]=max;
        }

        return answer;
    }

    public static void main(String[] args) {
        Ranking8 T = new Ranking8();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}
