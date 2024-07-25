package BEGINNER.Age_in_Days;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        //Receive days
        int days = input.nextInt();

        //Ternary operator(assigns value to a variable according to the expressed condition)
        int years = (days>=365)? days/365:0;
        days = days%365;
        int months = (days>=30)? days/30:0;
        days = days%30;
        
        System.out.printf("%d ano(s)",years);
        System.out.println();

        System.out.printf("%d mes(es)",months);
        System.out.println();

        System.out.printf("%d dia(s)",days);
        System.out.println();

        input.close();
    }

}