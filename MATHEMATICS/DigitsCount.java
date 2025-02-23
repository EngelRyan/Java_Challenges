package MATHEMATICS;
import java.io.IOException;
import java.util.Scanner;

public class DigitsCount {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        while (true) {
            int a = input.nextInt();
            int b = input.nextInt();
            
            if (a == 0 && b == 0) {
                break;
            }

            int[] digitCounts = new int[10]; 

            for (int i = a; i <= b; i++) {
                String number = String.valueOf(i);
                for (char digit : number.toCharArray()) {
                    digitCounts[digit - '0']++;
                }
            }

            for (int count : digitCounts) {
                System.out.print(count + " ");
            }
            System.out.println();
        }
        input.close();
    }
}
