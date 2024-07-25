package Figurines;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
       Scanner input = new Scanner(System.in);

       int n = input.nextInt();
       ArrayList<Integer> values = new ArrayList<>();
 
        while (n --> 0) {
                int f1 = input.nextInt();
                int f2 = input.nextInt();
                values.add(gcd(f1, f2)); 
                
        }
        for(int value : values){
            System.out.println(value);
        }

       input.close();
    }
    public static int gcd(int f1,int f2){
        while(f2!=0){
            int temp = f2;
            f2 = f1%f2;
            f1 = temp;
        }
        return f1;
    }
 
}