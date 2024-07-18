package Banknotes;

import java.io.IOException;
import java.util.Scanner;;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int value = input.nextInt();

        double[] bankNotes = {100,50,20,10,5,2,1};

        if(value>0 && value < 1000000){
            System.out.println(value);
            for (double note : bankNotes) {

                int howMany = (int) (value/note);

                value = (int) (value%note);
                                
                System.out.printf("%d nota(s) de R$ %.0f,00",howMany,note);
                System.out.println();

            }
        }
        input.close();
    }
}