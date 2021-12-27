import java.util.LinkedList;
import java.util.Scanner;

public class CurriculumDesign {

  public static String solution(String a, String b) {
    StringBuilder curriculum = new StringBuilder();

    LinkedList<Character> list = new LinkedList<>();
    for (char x : a.toCharArray()) {
      list.add(x);
    }

    for (char x : b.toCharArray()) {
      if (!list.isEmpty() && list.getFirst() == x) {
        list.removeFirst();
        curriculum.append(x);
      }
    }

    if (a.equals(curriculum.toString())) {
      return "YES";
    } else {
      return "NO";
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String firstLine = sc.nextLine();
    String secondLine = sc.nextLine();
    System.out.println(solution(firstLine, secondLine));
  }
}
