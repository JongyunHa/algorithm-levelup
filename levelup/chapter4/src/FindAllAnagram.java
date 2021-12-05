import java.util.HashMap;
import java.util.Scanner;

public class FindAllAnagram {
    public static int solution(String s, String t) {
        HashMap<Character, Integer> sm = new HashMap<>();
        HashMap<Character, Integer> tm = new HashMap<>();
        for (char x: t.toCharArray()) tm.put(x, tm.getOrDefault(x, 0) + 1);

        int L = t.length() - 1;
        for (int i = 0; i < L; i++) {
            sm.put(s.charAt(i), sm.getOrDefault(s.charAt(i), 0) + 1);
        }

        int left = 0;
        int count = 0;
        for (int right=L; right < s.length(); right++) {
            sm.put(s.charAt(right), sm.getOrDefault(s.charAt(right), 0) + 1);
            if (sm.equals(tm)) {
                count++;
            }
            sm.put(s.charAt(left), sm.get(s.charAt(left)) - 1);
            if (sm.get(s.charAt(left)) == 0) sm.remove(s.charAt(left));
            left++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(solution(s, t));
    }
}
