public class SubSet {

    static int n;
    static int[] check;

    public static void Dfs(int level) {
        if (level == n + 1) {
            for (int i = 0; i < check.length; i++) {
                if (check[i] == 1) {
                    System.out.printf("%d ", i);
                }
            }
            System.out.println();
            return;
        } else {
            check[level] = 1;
            Dfs(level + 1);
            check[level] = 0;
            Dfs(level + 1);
        }

    }

    public static void main(String[] args) {
        n = 3;
        check = new int[n + 1];
        Dfs(1);
    }
}
