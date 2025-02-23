package BEGINNER;

import java.util.Scanner;

public class SixOddNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        input.close();

        for (int i = 0; i < 6; i++) {
            while (number % 2 == 0) {
                number++;
            }
            System.out.println(number);
            number++;
        }
    }
}
