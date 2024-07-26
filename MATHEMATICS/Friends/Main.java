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
            values.add(pay(m,n));
        }
        
        for(int value : values){
            System.out.println(value);
        }
        input.close();
        
    }
    private static int pay(int m, int n){
        if(m==0){
            return n+1;
        }
        else if(n==0){
            return pay(m-1,1); 
        }
        else{
            return pay(m-1, pay(m, n-1));
        }
    }
}
