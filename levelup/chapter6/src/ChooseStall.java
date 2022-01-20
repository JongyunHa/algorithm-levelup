import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ChooseStall {

    public static int Solution(List<Integer> horses, int max) {
        // 1 2 8 4 9
        Collections.sort(horses);
        int answer = 0;
        int left = 1;
        int right = horses.stream()
            .max(Comparator.comparing(x -> x))
            .orElseThrow(NoSuchElementException::new);

        while (left <= right) {
            int pivot = (left + right) / 2;
            int latest = horses.get(0);
            int count = 1;
            for (int i = 1; i < horses.size(); i++) {
                if (horses.get(i) - latest >= pivot) {
                    count++;
                    latest = horses.get(i);
                }
            }
            if (count >= max) {
                answer = pivot;
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> horses = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            horses.add(sc.nextInt());
        }

        System.out.println(Solution(horses, m));
    }

}
