package inflearn.array;


import java.util.ArrayList;
import java.util.Scanner;

public class LookStudent2 {

    public static void main(String[] args) {
        LookStudent2 T = new LookStudent2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }

    private int solution(int n,int[] arr) {
        int answer=1;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }
        return answer;
    }
}
