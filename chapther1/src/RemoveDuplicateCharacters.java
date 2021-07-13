import java.util.Scanner;

/**
 * Inflearn 6.중복문자제거
 */
public class RemoveDuplicateCharacters {
    public static String solution(String s) {
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == i) {
                answer += s.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));
    }
}
