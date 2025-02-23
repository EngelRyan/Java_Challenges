package BEGINNER;
import java.io.IOException;
import java.util.Scanner;;
 
public class Consuption {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

        double a = input.nextDouble();
        double b = input.nextDouble();
        
        double average = a/b;

        System.out.printf("%.3f km/l",average);
        System.out.println();

        input.close();
    }
}

