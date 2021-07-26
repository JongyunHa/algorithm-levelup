import java.util.Arrays;
import java.util.Scanner;

// 10. 봉우리
public class Peaks {
    public static int solution(int n, int[][] peaks) {
        int answer = 0;
        for (int i = 0; i < n + 1; i++) {
            if (i == 0) continue;
            for (int j = 0; j < n + 1; j++) {
                if (j == 0) continue;
                if (peaks[i][j] > peaks[i - 1][j]
                && peaks[i][j] > peaks[i + 1][j]
                && peaks[i][j] > peaks[i][j - 1]
                && peaks[i][j] > peaks[i][j + 1]) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] peaks = new int[n + 2][n + 2];
        for (int i = 0; i < n + 1; i++) {
            Arrays.fill(peaks[i], 0);
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                peaks[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(n, peaks));
    }

}
