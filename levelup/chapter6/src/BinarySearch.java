import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BinarySearch {

    public static int Solution(List<Integer> nums, int target) {
        int left, right, pivot;
        left = 0;
        right = nums.size();

        Collections.sort(nums);

        while (left <= right) {
            pivot = (left + right) / 2;
            int n = nums.get(pivot);

            if (target == n) {
                return pivot + 1;
            }
            // 0 3 4 5 7 8
            if (target < n) {
                right = pivot - 1;
            }

            if (target > n) {
                left = pivot + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            nums.add(sc.nextInt());
        }

        System.out.println(Solution(nums, m));
    }
}
