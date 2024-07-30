import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double n1 = input.nextDouble();
        double n2 = input.nextDouble();
        double n3 = input.nextDouble();
        double n4 = input.nextDouble();
        
        double media = ((2*n1)+(3*n2)+(4*n3)+n4) / 10;

        if(media>=7){
            System.out.printf("Media: %.1f",media);
            System.out.println();
            System.out.println("Aluno aprovado.");
        }

     



        input.close();
    }
}
