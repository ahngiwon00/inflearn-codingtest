package inflearn.array;


import java.util.ArrayList;
import java.util.Scanner;

public class InvertedPrimeNumber6 {

    public int reverseNumber(int tmp, int reserve) {
        while (tmp > 0) {
            int rest= tmp %10;
            reserve = reserve * 10 + rest;
            tmp = tmp / 10;
        }
        return reserve;
    }

    public boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private ArrayList<Integer> solution(int n,int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int reserve=0;
            int reverseNum = reverseNumber(tmp, reserve);
            if (isPrime(reverseNum)) {
                answer.add(reverseNum);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        InvertedPrimeNumber6 T = new InvertedPrimeNumber6();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }
}
