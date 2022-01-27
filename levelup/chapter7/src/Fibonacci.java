import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    static int[] memo;

    public static int Dfs(int n) {
        if (memo[n] != 0) {
            return memo[n];
        }

        if (n == 1) {
            return memo[n] = 1;
        } else if (n == 2) {
            return memo[n] = 1;
        } else {
            return memo[n] = Dfs(n - 2) + Dfs(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        memo = new int[n + 1];
        Dfs(n);

        for (int i = 1; i <= n; i++) {
            System.out.printf("%d ", memo[i]);
        }
    }
}
