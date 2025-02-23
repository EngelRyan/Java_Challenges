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
        else if(media>=5 && media <=6.9){
            System.out.printf("Media: %.1f",media);
            System.out.println();
            System.out.print("Aluno em exame.");
            double exam = input.nextDouble();
            System.out.println();
            System.out.printf("Nota do exame: %.1f",exam);
            System.out.println();
            if ((media+exam)/2 >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f",(media+exam)/2);
                System.out.println();
            }
            else{
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f",(media+exam)/2);
                System.out.println();
            }
        }
        else{
            System.out.printf("Media: %.1f",media-0.1);
            System.out.println();
            System.out.println("Aluno reprovado.");
        }
        input.close();
    }
}
