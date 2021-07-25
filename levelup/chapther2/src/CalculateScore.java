import java.util.Scanner;

public class CalculateScore {
    public static int solution(int[] scores) {
       int answer = 0;
       int accu = 0;
       for (int score: scores) {
           if (score == 0) accu = 0;
           else {
               accu++;
           }
           answer += accu;
       }
       return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++ ) {
            scores[i] = in.nextInt();
        }
        System.out.println(solution(scores));
    }
}
