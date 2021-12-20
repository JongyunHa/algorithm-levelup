import java.util.LinkedList;
import java.util.Scanner;

class RemoveParenthesisChar {

  public static String Solution(String s) {
    StringBuilder answer = new StringBuilder();
    LinkedList<String> stack = new LinkedList<>();

    for (char c : s.toCharArray()) {
      if (c == '(') {
        stack.add(Character.toString(c));
      } else if (c == ')') {
        stack.removeLast();
      } else {
        if (stack.isEmpty()) {
          answer.append(Character.toString(c));
        }
      }
    }

    return answer.toString();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    System.out.println(Solution(s));
  }
}
