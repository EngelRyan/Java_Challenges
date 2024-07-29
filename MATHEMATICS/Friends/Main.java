import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        int[] results = new int[t];

        for (int i = 0; i < t; i++) {
            int m = input.nextInt();
            int n = input.nextInt();
            results[i] = pay(m, n);
        }

        for (int result : results) {
            System.out.println(result);
        }
        input.close();
    }

    private static int pay(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (n == 0) {
            return pay(m - 1, 1);
        } else {
            return  pay(m - 1, pay(m, n - 1));
        }
    }
}
