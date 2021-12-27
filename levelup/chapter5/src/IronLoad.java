import java.util.LinkedList;
import java.util.Scanner;

public class IronLoad {

  public static int solution(String lines) {
    int answer = 0;
    LinkedList<String> list = new LinkedList<>();

    for (int i = 0; i < lines.length(); i++) {
      if (lines.charAt(i) == '(') {
        list.add(String.valueOf(lines.charAt(i)));
      } else {
        list.removeLast();
        if (lines.charAt(i - 1) == '(') {
          answer += list.size();
        } else {
          answer++;
        }
      }
    }

    return answer;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();
    System.out.println(solution(line));
  }
}
