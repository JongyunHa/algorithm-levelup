import java.util.Scanner;

public class Mentoring {
    public static int solution(int n, int m, int[][] mathScores) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {
                        if (mathScores[k][s] == i) pi = s;
                        if (mathScores[k][s] == j) pj = s;
                    }
                    if (pi < pj) cnt++;
                }
                if (cnt == m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] mathScores = new int[m][n];

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                mathScores[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(n, m, mathScores));
    }
}
