package BEGINNER;
import java.io.IOException;
import java.util.Scanner;

public class AreaOfCircle {
 
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);

        double r = input.nextDouble();

        double a = 3.14159 * (r*r);

        System.out.printf("A=%.4f",a);
        System.out.println();

        input.close();
    }
 
}