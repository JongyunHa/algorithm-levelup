import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.StringTokenizer;

public class Mischief {

    public static List<Integer> Solution(List<Integer> students) {
        List<Integer> answer = new ArrayList<>();
        List<Integer> copy = new ArrayList<>(students);
        Collections.sort(copy);

        for (int i = 0; i < students.size(); i++) {
            if (!Objects.equals(copy.get(i), students.get(i))) {
                answer.add(i + 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> students = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            students.add(Integer.parseInt(st.nextToken()));
        }

        List<Integer> answer = Solution(students);
        for (Integer i : answer) {
            System.out.printf("%d ", i);
        }
    }

}
