import java.util.LinkedList;
import java.util.Scanner;

public class Postfix {

  public static boolean isContains(String[] operator, String target) {
    for (String s : operator) {
      if (s.equals(target)) {
        return true;
      }
    }
    return false;
  }

  public static int solution(String str) {
    String[] operator = new String[]{"+", "-", "*", "/"};
    LinkedList<Integer> number = new LinkedList<>();
    int left, right = 0;

    for (char c : str.toCharArray()) {
      if (isContains(operator, String.valueOf(c))) {
        right = number.removeLast();
        left = number.removeLast();
        switch (c) {
          case '+':
            number.add(left + right);
            break;
          case '-':
            number.add(left - right);
            break;
          case '*':
            number.add(left * right);
            break;
          case '/':
            number.add(left / right);
            break;
          default:
            break;
        }
      } else {
        number.add(c - '0');
      }
    }

    return number.removeLast();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    System.out.println(solution(line));
  }
}
