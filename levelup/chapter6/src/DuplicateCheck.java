import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class DuplicateCheck {

    public static String Solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (Integer value : map.values()) {
            if (value > 1) {
                return "D";
            }
        }
        return "U";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        String input = br.readLine();

        nums = Arrays.stream(input.split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Solution(nums));
    }
}
