import java.util.Scanner;

/**
 * 7.회문 문자열
 */
public class PalindromeString {
//    myself
//    public static String solution(String s) {
//        s = s.toLowerCase();
//        String answer = "YES";
//        StringBuffer sb = new StringBuffer(s);
//        String reversedS = sb.reverse().toString();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) != reversedS.charAt(i)) {
//                return "NO";
//            }
//        }
//        return answer;
//    }
    public static String solution(String s) {
        s = s.toLowerCase();
        final int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(solution(s));
    }
}
