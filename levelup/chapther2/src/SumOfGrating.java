import java.util.Scanner;

public class SumOfGrating {
    public static int solution(int n, int[][] grating) {
        int answer = Integer.MIN_VALUE;
        int sumRow, sumCol;
        for (int i = 0; i < n; i++) {
            sumRow=sumCol=0;
            for (int j = 0; j < n; j++) {
                sumRow += grating[i][j];
                sumCol += grating[j][i];
            }
            answer = Math.max(answer, sumRow);
            answer = Math.max(answer, sumCol);
        }
        int diagonalSum = 0, reverseDiagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += grating[i][i];
            reverseDiagonalSum += grating[n - i - 1][n - i - 1];
        }
        answer = Math.max(answer, diagonalSum);
        answer = Math.max(answer, reverseDiagonalSum);
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] grating = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grating[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(n, grating));
    }
}
