package MATHEMATICS.Digits_Count;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
    
        String[] numberToStrings = new String[b-a+1];
        String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};

        for(int i = a, n = 0; i<=b; i++,n++){
            numberToStrings[n] = String.valueOf(i);
        }
        
        for(String number : numbers){
            int q = 0;
            for(String numString : numberToStrings){
                if (numString.contains(number)) {
                    q += 1;
                }
            }
            System.out.print(q);
        }
        input.close();
    }
}

