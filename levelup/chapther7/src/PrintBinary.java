import java.util.Scanner;

public class PrintBinary {
    public static void solution(int x) {
        if (x == 0) return;
        else {
            solution(x / 2);
            System.out.print(x % 2 + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        solution(x);
    }
}
