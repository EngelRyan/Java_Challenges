import java.io.IOException;
import java.util.Scanner;;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in); 
        
        int spentTime = input.nextInt();
        int averageSpeed = input.nextInt();

        double manyLiters = (double)(spentTime*averageSpeed)/12;

        System.out.printf("%.3f",manyLiters);
        System.out.println();

        input.close();
    }
 
}