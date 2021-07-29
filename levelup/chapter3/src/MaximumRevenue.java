import java.util.Scanner;

// 슬라이딩 윈도우
public class MaximumRevenue {
    public static int solution(int k, int[] incomes) {
        int sum = 0, lt = 0, rt = 0, max = 0;
        while (rt < incomes.length) {
            if (rt < k) {
                sum += incomes[rt++];
                continue;
            }
            if (sum > max) max = sum;
            sum -= incomes[lt++];
            sum += incomes[rt++];
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] incomes = new int[n];
        for (int i = 0; i < n; i++) {
            incomes[i] = in.nextInt();
        }
        System.out.println(solution(k, incomes));
    }
}
