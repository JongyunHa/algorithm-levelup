import java.util.Scanner;

public class VisibleStudent {
    public static int solution(int[] intArray) {
        int result = 1;
        int max = intArray[0];
        for (int i = 1; i < intArray.length; i++) {
            if (intArray[i] > max) {
                result++;
                max = intArray[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int digit = in.nextInt();
        int[] intArray = new int[digit];

        for (int i = 0; i < digit; i++) {
            intArray[i] = in.nextInt();
        }
        System.out.println(solution(intArray));
    }
}
