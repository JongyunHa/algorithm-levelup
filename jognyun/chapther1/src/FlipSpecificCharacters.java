import java.util.Scanner;

public class FlipSpecificCharacters {
    public static boolean isAlphabet(char c) {
        if (((int) c >= 65 && (int) c <= 90) ||  ((int) c >= 97 && (int) c <= 122)) return true;
        else return false;
    }

    public static char[] solution(String s) {
        int lt = 0;
        int rt = s.length() - 1;
        char[] chs = s.toCharArray();
        char temp;

        while (lt <= rt) {
            if (!isAlphabet(chs[lt])) lt++;
            else if (!isAlphabet((chs[rt]))) rt--;
            else {
                temp = chs[lt];
                chs[lt] = chs[rt];
                chs[rt--] = temp;
                lt++;
            }
        }
        return chs;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.print(solution(s));
    }
}
