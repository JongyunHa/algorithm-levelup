import java.util.Scanner;

public class StringCompress {
    public static String solution(String s) {
        String answer = "";
        int cnt = 1;

        for (int i = 0; i < s.length() - 1; i++) {
            char target = s.charAt(i);
            char compare = s.charAt(i + 1);
            if (target == compare) cnt++;
            else {
                answer += target;
                answer += cnt == 1 ? "" : Integer.toString(cnt);
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s += " ";
        System.out.println(solution(s));
    }
}
