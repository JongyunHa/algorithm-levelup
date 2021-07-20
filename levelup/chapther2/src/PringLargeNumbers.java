import java.util.ArrayList;
import java.util.Scanner;

public class PringLargeNumbers {
    public static ArrayList<Integer> solution(int[] intArray) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(intArray[0]);

        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > intArray[i - 1]) result.add(intArray[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int digit = in.nextInt();
        int[] intArray = new int[digit];
        for(int i = 0; i < digit; i++) {
            intArray[i] = in.nextInt();
        }
        for (int x: solution(intArray)) {
            System.out.print(x + " ");
        }
    }
}