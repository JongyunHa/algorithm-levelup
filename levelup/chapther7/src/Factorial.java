import java.util.Scanner;

public class Factorial {
    public static int solution(int n) {
        if (n == 1) return 1;
        else return n * solution(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(solution(n));
    }
}
