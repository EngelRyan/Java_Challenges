package BEGINNER;
import java.io.IOException;
import java.util.Scanner;;
 
public class Distance {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

        int distance = input.nextInt();

        int howLong =  distance*2;

        System.out.printf("%d minutos",howLong);
        System.out.println();
        
        input.close();

    }
}
