import java.util.Scanner;

public class FindRank {
    public static int[] solution(int[] scores) {
        int[] ranks = new int[scores.length];
        for (int i = 0; i < ranks.length; i++) {
            int temp = 1;
            for (int j = 0; j < ranks.length; j++) {
                if (scores[i] < scores[j]) temp++;
            }
            ranks[i] = temp;
        }
        return ranks;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = in.nextInt();
        }

        for (int rank: solution(scores)) {
            System.out.printf("%d ", rank);
        }
    }
}
