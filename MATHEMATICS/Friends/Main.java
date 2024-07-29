import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    private static int[][] memo = new int[5][300]; 

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        ArrayList<Integer> values = new ArrayList<>();
        
        while(t --> 0){
            int m = input.nextInt();
            int n = input.nextInt();
            values.add(pay(m,n));
            System.out.println();
        }
        
        for(int value : values){
            System.out.println(value);
        }
        input.close();
        int temp = 2;
    }
    private static int pay(int m, int n){
        if (memo[m][n] != 0) {
            return memo[m][n];
        }
        if(m==0){
            return memo[m][n] = n + 1;        }
        else if(n==0){
            return memo[m][n] = pay(m - 1, 1);
        }
        else{
            return memo[m][n] = pay(m - 1, pay(m, n - 1));
        }
    }
}
