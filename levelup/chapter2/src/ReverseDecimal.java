import java.util.ArrayList;
import java.util.Scanner;

public class ReverseDecimal {
    public static boolean isPrime(int x) {
        if (x == 1) return false;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static ArrayList<Integer> solution(int[] nums) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int x: nums) {
            int temp = x;
            int res = 0;
            while (temp > 0) {
                int t = temp % 10;
                res = res * 10 + t;
                temp /= 10;
            }
            if(isPrime(res)) answer.add(res);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        for (int x: solution(nums)) {
            System.out.print(x + " ");
        }
    }
}
