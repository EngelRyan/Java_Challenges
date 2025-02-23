package MATHEMATICS;
import java.io.IOException;
import java.util.Scanner;

public class Friends {

    static int[][] values = new int[5][201];
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);


        int t = input.nextInt();

        while (t-- > 0) {
            int m = input.nextInt();
            int n = input.nextInt();
            System.out.println(pay(m, n));
        }

        input.close();
    }

    private static int pay(int m, int n) {
        int result;
        if (m == 0) {
            result = n + 1;
        } else if (n == 0) {
            result = pay(m - 1, 1);
        } else {
            result = pay(m - 1, pay(m, n - 1));
        }
        return result;
    }
}
