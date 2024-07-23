import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double number = input.nextDouble();

        if (number >= 0 && number <= 25){
            System.out.print("Intervalo [0,25]");
        }
        else if (number>25 && number <=50){
            System.out.print("Intervalo (25,50]");
        }
        else if (number>50 && number <=75){
            System.out.print("Intervalo [50,75]");
        }
        else if (number>75 && number <=100){
            System.out.print("Intervalo (75,100]");
        }
        else{
            System.out.print("Fora de intervalo");
        }
        
        System.out.println();

        input.close();
    }

}
