import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int[] numbers = {A, B, C};
        Arrays.sort(numbers);

        // 두 번째로 큰 수는 정렬된 배열의 두 번째 요소
        System.out.println(numbers[1]);
    }
}
