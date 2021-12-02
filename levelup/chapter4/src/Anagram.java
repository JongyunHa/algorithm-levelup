import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static String solution(String a, String b) {
        HashMap<Character, Integer> aMap = new HashMap<>();
        HashMap<Character, Integer> bMap = new HashMap<>();
        for (char x : a.toCharArray()) {
            aMap.put(x, aMap.getOrDefault(x, 0) + 1);
        }
        for (char x : b.toCharArray()) {
            bMap.put(x, bMap.getOrDefault(x, 0) + 1);
        }
        for (Character key: aMap.keySet()) {
            if (!bMap.containsKey(key) || !aMap.get(key).equals(bMap.get(key))) {
                return "NO";
            }
        }
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(solution(a, b));
    }
}