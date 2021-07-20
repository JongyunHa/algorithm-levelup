import java.util.Scanner;

public class RockPaperScissors {
    public static char[] solution(int[] arrayA, int[] arrayB) {
        char[] result = new char[arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
            switch (arrayA[i] - arrayB[i]) {
                case 0:
                    result[i] = 'D';
                    break;
                case -1:
                case 2:
                    result[i] = 'B';
                    break;
                default:
                    result[i] = 'A';
                    break;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int digit = in.nextInt();
        int[] arrayA = new int[digit];
        int[] arrayB = new int[digit];

        for(int i = 0; i < digit; i++) {
            arrayA[i] = in.nextInt();
        }
        for(int i = 0; i < digit; i++) {
            arrayB[i] = in.nextInt();
        }
        for (char ch: solution(arrayA, arrayB)) {
            System.out.println(ch);
        }
    }
}
