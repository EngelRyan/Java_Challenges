import java.io.IOException;
import java.util.Scanner;;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        //Ternary operator(assigns value to a variable according to the expressed condition)
        int greatest = (a>=b)? (a+c + Math.abs(a-c)) / 2:(b+c + Math.abs(b-c)) / 2;

        System.out.printf("%d eh o maior",greatest);
        System.out.println();

        input.close();
    }
}
