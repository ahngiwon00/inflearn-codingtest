package inflearn.array;


import java.util.Scanner;

public class PrimeNumber5 {

    public static void main(String[] args) {
        PrimeNumber5 T = new PrimeNumber5();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));


    }

    private int solution(int n) {
        int answer=0;
        int[] arr = new int[n + 1];
        for (int i = 2; i < n+1; i++) {
            if (arr[i] == 0) {
                answer++;
                for (int j = i; j < n+1; j=j+i) {
                    arr[j]=1;
                }
            }
        }
        return answer;
    }
}
