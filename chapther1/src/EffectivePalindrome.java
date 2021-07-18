import java.util.Scanner;

// 8.유효한 팰린드롬
public class EffectivePalindrome {
    public static String solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A-Z]", "");
        String temp = new StringBuilder(s).reverse().toString();

        if (s.equals(temp)) {
            answer = "YES";
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(solution(s));
    }
}
