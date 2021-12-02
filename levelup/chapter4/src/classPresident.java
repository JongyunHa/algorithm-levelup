import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class classPresident {
    public static char solution(String s) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : s.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() > max) {
                max = m.getValue();
                answer = m.getKey();
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String voteResult = scanner.next();
        System.out.println(solution(voteResult));
    }
}


