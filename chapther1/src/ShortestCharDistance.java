import java.util.Scanner;

public class ShortestCharDistance {
    public static  int[] solution(String s, char target) {
        int[] answer = new int[s.length()];
        int point = 1000;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                point = 0;
                answer[i] = point;
            }
            else answer[i] = ++point;
        }

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == target) point = 0;
            else answer[i] = Math.min(answer[i], ++point);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char c = in.next().charAt(0);
        for (int x: solution(s, c)) {
            System.out.printf("%d ", x);
        }
    }
}