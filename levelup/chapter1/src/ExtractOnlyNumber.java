import java.util.Scanner;

public class ExtractOnlyNumber {
    public static long solution(String s){
        long answer = 0;
        for (char x: s.toCharArray()) {
            if (x >= 48 && x <= 57) {
                answer = answer * 10 + (x - 48);
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
