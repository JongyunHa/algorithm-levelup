import java.util.Scanner;

public class ContinuousPartialSequence {
    public static int solution(int m, int[] arr) {
        int answer = 0, lt = 0, accumulate = 0;
        for (int rt = 0; rt < arr.length; rt++) {
            accumulate += arr[rt];
            if (accumulate == m) answer++;
            while (accumulate >= m) {
                accumulate -= arr[lt++];
                if (accumulate == m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(m, arr));
    }
}
