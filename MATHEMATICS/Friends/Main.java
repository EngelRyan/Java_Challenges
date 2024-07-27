import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    private static int[][] memo = new int[5][201]; 

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
        String key = m + "," + n;


        int result;

        if(m==0){
            result = n+1;
        }
        else if(n==0){
            result = pay(m-1,1); 
        }
        else{
            result = pay(m-1, pay(m, n-1));
        }

        
        return result;
    }
}
