public class RecursiveFunction {
    public static void dfs(int n) {
        if (n == 0) return;
        else {
            dfs(n - 1);
            System.out.printf("%d ", n);
        }
    }

    public static void main(String[] args) {
        int n = 3;
        dfs(n);
    }
}