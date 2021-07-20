import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    public static int[] solution(int digit) {
        int[] answer = new int[digit];
        for (int i = 0; i < digit; i++) {
            if (i < 2) answer[i] = 1;
            else  answer[i] = answer[i - 2] + answer[i - 1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int digit = in.nextInt();
        for (int x: solution(digit)) {
            System.out.printf("%d ", x);
        }
    }
}
