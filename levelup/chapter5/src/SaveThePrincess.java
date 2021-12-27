import java.util.LinkedList;
import java.util.Scanner;

public class SaveThePrincess {

  public static int solution(int n, int k) {
    LinkedList<Integer> princes = new LinkedList<>();
    for (int i = 1; i <= n; i++) {
      princes.add(i);
    }

    while (1 < princes.size()) {
      for (int i = 0; i < k - 1; i++) {
        int pullOut = princes.removeFirst();
        princes.add(pullOut);
      }
      princes.removeFirst();
    }

    return princes.getFirst();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n, k;
    n = sc.nextInt();
    k = sc.nextInt();
    System.out.println(solution(n, k));
  }
}
