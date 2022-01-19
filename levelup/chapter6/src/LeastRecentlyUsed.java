import java.util.Arrays;
import java.util.Scanner;

public class LeastRecentlyUsed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s, n, i, j;
        s = sc.nextInt();
        n = sc.nextInt();

        int[] arr = new int[s];
        for (i = 0; i < n; i++) {
            int input = sc.nextInt();
            int targetIdx = s - 1;
            for (j = 0; j < s; j++) {
                if (input == arr[j]) {
                    targetIdx = j;
                    break;
                }
            }

            for (int k = targetIdx; k > 0; k--) {
                arr[k] = arr[k - 1];
            }
            arr[0] = input;
        }
        for (int x : arr) {
            System.out.printf("%d ", x);
        }
    }
}
