import java.util.Scanner;

public class AppointingTempLeader {
    public static int solution(int n, int[][] students) {
        int answer = 0, max = Integer.MIN_VALUE;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (students[i][k] == students[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max) {
                max=cnt;
                answer=i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] students = new int[n + 1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                students[i][j] = in.nextInt();
            }
        }
        System.out.println(solution(n, students));
    }
}
