import java.util.Scanner;

public class ReversWord {
    public static String solution(String s) {
        StringBuffer sb = new StringBuffer(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(solution(in.next()));
        }
    }
}
