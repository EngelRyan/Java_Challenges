package MATHEMATICS.Friends;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        ArrayList<Integer> values = new ArrayList<>();

        while(t --> 0){
            int m = input.nextInt();
            int n = input.nextInt();
            System.out.println("TESTE");
        }
        
        for(int value : values){
            System.out.println(value);
        }
        input.close();
        
    }
}