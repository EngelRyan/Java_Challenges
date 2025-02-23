package MATHEMATICS;
import java.util.Scanner;

public class Blob {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] howMany  = new int[n];

        for(int i = 0; i<n; i++){

            double food = input.nextDouble();

            while (food > 1) {
                food /= 2;
                howMany[i]++;
            }
        }
        for(int days : howMany){
            System.out.printf("%d dias",days);
            System.out.println();
        }
        input.close();
    }
}
