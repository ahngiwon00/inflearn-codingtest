package inflearn.array;


import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci4 {

    public static void main(String[] args) {
        Fibonacci4 T = new Fibonacci4();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x : T.solution(n)) {
            System.out.print(x+" ");
        }

    }

    private int[] solution(int n) {
        int[] arr = new int[n];
        arr[0]=1;
        arr[1]=1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr;
    }
}
