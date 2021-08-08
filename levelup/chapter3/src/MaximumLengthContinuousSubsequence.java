import java.util.Scanner;

public class MaximumLengthContinuousSubsequence {
    public static int solution(int n, int k, int[] bins) {
        int answer = 0, lt = 0, convertCnt = 0;
        for (int rt = 0; rt < n; rt++) {
            if (bins[rt] == 0) convertCnt++;
            while (convertCnt > k) {
                if (bins[lt] == 0) convertCnt--;
                lt++;
            }
            answer = Math.max(answer, rt - lt + 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] bins = new int[n];

        for (int i=0; i<n; i++) {
            bins[i] = in.nextInt();
        }
        System.out.println(solution(n, k, bins));
    }
}
