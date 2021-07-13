import java.util.Scanner;

class CaseConversion {
    public static String solution(String s) {
        String answer = "";
        for (char ch: s.toCharArray()) {
            if (Character.isUpperCase(ch)) answer += Character.toLowerCase(ch);
            else  answer += Character.toUpperCase(ch);
        }
        return answer;
    }

    public static void main (String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(solution(str));
    }
}
