import java.util.Scanner;

public class Cryptogram {
    public static String solution(int digit, String s) {
        final int arange = s.length() / digit;
        String result = "";

        for (int i = 0; i < s.length(); i += arange) {
            String word = s.substring(i, i + arange);
            word = word.replace("#", "1");
            word = word.replace("*", "0");
            char ch = (char) Integer.parseInt(word, 2);
            result += ch;
        }
        return result;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int digit = in.nextInt();
        String s = in.next();
        System.out.println(solution(digit, s));
    }
}
