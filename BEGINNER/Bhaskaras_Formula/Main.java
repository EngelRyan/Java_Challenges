import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a == 0 || b*b<(4*a*c)) {
            System.out.print("Impossivel calcular");
        }
        else{
            double x1 = ((-b) + Math.sqrt((b*b)-(4*a*c)))/(2*a);
            double x2 = ((-b) - Math.sqrt((b*b)-(4*a*c)))/(2*a);

            System.out.printf("R1 = %.5f",x1);
            System.out.println();
            System.out.printf("R2 = %.5f",x2);
        }
        System.out.println();

        input.close();
    }

}