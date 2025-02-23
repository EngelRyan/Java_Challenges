package BEGINNER;
import java.io.IOException;
import java.util.Scanner;

public class SelectionTest1 {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();

        String condition = (b>c && d>a && c+d>a+b && c>0 && d>0 && a%2==0) ? "Valores aceitos" : "Valores nao aceitos";

        System.out.print(condition);
        System.out.println();

        input.close();
    }

}