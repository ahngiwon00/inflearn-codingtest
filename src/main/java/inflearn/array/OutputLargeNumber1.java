package inflearn.array;


import java.util.ArrayList;
import java.util.Scanner;

public class OutputLargeNumber1 {

    public static void main(String[] args) {
        OutputLargeNumber1 T = new OutputLargeNumber1();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n,arr));
    }

    private ArrayList<Integer> solution(int n,int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }
}
