import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class WordInSentence {
    public static String solution(String s) {
        String longString = "";
        int max = 0;
        for (String ele: s.split(" ")) {
            if (max < ele.length()) {
                longString = ele;
                max = ele.length();
            }
        }
        return longString;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(solution(s));
    }
}
