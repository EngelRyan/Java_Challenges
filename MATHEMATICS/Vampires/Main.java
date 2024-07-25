package MATHEMATICS.Vampires;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        ArrayList<Double> values = new ArrayList<>();
        

        while (true) {
            int ev1 = input.nextInt();
            int ev2 = input.nextInt();
            int at = input.nextInt();
            int d = input.nextInt();

            if (ev1 == 0 && ev2 == 0 && at == 0 && d == 0) {
            break;
            }

            values.add(probability(ev1, ev2, at, d));
        }

        for(double value : values){
            System.out.printf("%.1f",value);
            System.out.println();
        }
        
    }
    public static double probability(int ev1,int ev2,int at,int d){
        

    }
 
}