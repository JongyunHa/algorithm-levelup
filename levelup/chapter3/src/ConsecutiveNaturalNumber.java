import java.util.Scanner;

public class ConsecutiveNaturalNumber {
    public static int solution(int n) {
        int cnt = 0, lt = 0, sum = 0;
        int[] nums = new int[n / 2 + 1];
        for (int i = 0; i < nums.length; i++) nums[i] = i + 1;

        for (int rt = 0; rt < nums.length; rt++) {
            sum += nums[rt];
            if(sum==n) cnt++;
            while (sum >= n) {
                sum -= nums[lt++];
                if (sum == n) cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(solution(n));
    }
}
