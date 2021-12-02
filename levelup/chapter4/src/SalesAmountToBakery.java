import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class SalesAmountToBakery {
    public static ArrayList<Integer> solution(ArrayList<Integer> sales, int n, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k - 1; i++) {
            map.put(sales.get(i), map.getOrDefault(sales.get(i), 0) + 1);
        }

        int left = 0;
        for (int right = k-1; right < n; right++) {
            map.put(sales.get(right), map.getOrDefault(sales.get(right), 0) + 1);
            result.add(map.size());
            map.put(sales.get(left), map.get(sales.get(left)) - 1);
            if (map.get(sales.get(left)) == 0) map.remove(sales.get(left));
            left++;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ArrayList<Integer> salesAmountWeek = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            salesAmountWeek.add(sc.nextInt());
        }
        ArrayList<Integer> result =  solution(salesAmountWeek, n, k);
        for (Integer r : result) {
            System.out.printf("%d ", r);
        }
    }
}
