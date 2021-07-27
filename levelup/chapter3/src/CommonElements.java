import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CommonElements {
    public static ArrayList<Integer> solution(int[] arr1, int[] arr2) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1 = 0, p2 = 0;
        while (p1 < arr1.length && p2 < arr2.length) {
            if (arr1[p1] == arr2[p2]) {
                answer.add(arr1[p1++]);
                p2++;
            }
            else if (arr1[p1] < arr2[p2]) p1++;
            else p2++;
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
    }
}
