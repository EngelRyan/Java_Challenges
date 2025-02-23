package BEGINNER;
import java.io.IOException;
import java.util.Scanner;

public class Snack {    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double[] snacks = {4,4.50,5,2,1.50};

        int x = input.nextInt();   
        int y = input.nextInt();   

        for(int i = 0;i<snacks.length;i++){
            if (x == i+1) {
                System.out.printf("Total: R$ %.2f",snacks[i]*y);
            }
        }
        System.out.println();

        input.close();
    }
}