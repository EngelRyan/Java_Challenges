package BEGINNER;
import java.io.IOException;
import java.util.Scanner;

public class SimpleCalculate {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        String product1 = input.nextLine();
        String product2 = input.nextLine();

        String[] list1 = product1.split(" ");
        String[] list2 = product2.split(" ");

        double value1 = Integer.parseInt(list1[1]) * Double.parseDouble(list1[2]);
        double value2 = Integer.parseInt(list2[1]) * Double.parseDouble(list2[2]);

        double result = value1+value2;

        System.out.printf("VALOR A PAGAR: R$ %.2f",result);
        System.out.println();

        input.close();
    }

}