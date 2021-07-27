import java.util.ArrayList;
import java.util.Scanner;

public class CombineTwoArrays {
    public static ArrayList<Integer> solution(int[] arr1, int[] arr2) {
        int p1 = 0, p2 = 0;
        ArrayList<Integer> answer = new ArrayList<>();
        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
            else answer.add(arr2[p2++]);
        }

        for (int i=p1; i<arr1.length; i++) {
            answer.add(arr1[p1]);
        }
        for (int i=p2; i< arr2.length; i++) {
            answer.add(arr2[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        for (int i=0; i<n; i++) {
            arr1[i] = in.nextInt();
        }
        n = in.nextInt();
        int[] arr2 = new int[n];
        for (int i=0; i<n; i++) {
            arr2[i] = in.nextInt();
        }
        for (int x: solution(arr1, arr2)) {
            System.out.printf("%d ", x);
        }
        System.out.println();
    }
}
