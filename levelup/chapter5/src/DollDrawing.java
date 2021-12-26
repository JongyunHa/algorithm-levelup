import java.util.LinkedList;
import java.util.Scanner;

public class DollDrawing {

  public static int solution(int n, int[][] board, int[] drawing) {
    LinkedList<Integer> deque = new LinkedList<>();
    int count = 0;

    for (int d : drawing) {
      int last = 0;
      for (int i = 0; i < n; i++) {
        last = board[i][d - 1];
        if (last != 0) {
          board[i][d - 1] = 0;
          break;
        }
      }
      if (last == 0) {
        continue;
      }

      if (deque.isEmpty()) {
        deque.add(last);
      } else {
        int lastDeque = deque.getLast();
        if (lastDeque == last) {
          count += 2;
          deque.removeLast();
        } else {
          deque.add(last);
        }
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] board = new int[n][n];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        board[i][j] = sc.nextInt();
      }
    }
    int m = sc.nextInt();
    int[] drawing = new int[m];
    for (int i = 0; i < m; i++) {
      drawing[i] = sc.nextInt();
    }

    System.out.println(solution(n, board, drawing));
  }
}
