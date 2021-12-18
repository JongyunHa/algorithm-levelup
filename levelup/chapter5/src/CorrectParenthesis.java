import java.util.LinkedList;
import java.util.Scanner;

public class CorrectParenthesis {

  public static String solution(String str) {
    LinkedList<String> deque = new LinkedList<>();

    for (char c : str.toCharArray()) {
      if (c == '(') {
        deque.add(Character.toString(c));
      } else {
        if (deque.isEmpty()) return "NO";
        else deque.removeLast();
      }
    }

    return "YES";
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    System.out.println(solution(str));
  }
}
