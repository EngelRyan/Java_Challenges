import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

        int[] values = new int[3];

        int[] sortValues = new int[3];

        for(int i = 0; i<3; i++){
            values[i] = input.nextInt();
            sortValues[i] = values[i];
        }

        for (int i = 0; i < values.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < values.length; j++) {
                if (sortValues[j] < sortValues[min]) {
                    min = j; 
                }
            }
        }

        for(int v : sortValues){
            System.out.println(v);
        }

        for(int v : values){
            System.out.println(v);
        }
    }
 
}