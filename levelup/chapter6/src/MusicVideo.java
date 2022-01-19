import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MusicVideo {

    public static int count(List<Integer> dvds, int pivot) {
        int accu = 0;
        int count = 1;

        for (int dvd : dvds) {
            if (accu + dvd > pivot) {
                accu = dvd;
                count++;
            } else {
                accu += dvd;
            }
        }
        return count;
    }

    public static int Solution(List<Integer> dvds, int target) {
        int total = dvds.stream().mapToInt(x -> x).sum();

        int right, pivot;
        int answer = 0;
        int left = dvds.stream()
            .min(Comparator.comparing(x -> x))
            .orElseThrow(NoSuchElementException::new);
        right = total;

        while (left <= right) {
            pivot = (left + right) / 2;
            if (count(dvds, pivot) <= target) {
                answer = pivot;
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> dvds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            dvds.add(sc.nextInt());
        }
        System.out.println(Solution(dvds, m));
    }
}
