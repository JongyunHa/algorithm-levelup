import java.util.Scanner;

public class ConsecutiveNaturalNumber_MathVer {
    public static int solution(int n) {
        int answer = 0, cnt = 1;
        n--;
        while(n>0) {
            cnt++;
            n -= cnt;
            if (n % cnt == 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(solution(n));
    }
}
