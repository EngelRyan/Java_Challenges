import java.io.IOException;
import java.util.Scanner;;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double value = input.nextDouble();

        int[] bankNotes = {100,50,20,10,5,2};

        double[] bankCoins = {1,0.50,0.25,0.10,0.05,0.01};

     
        System.out.println("NOTAS:");
        if(value>0 && value < 1000000){
            for (int note : bankNotes) {

                int howMany = (int) (value/note);

                value = value%note;
                 
                System.out.printf("%d nota(s) de R$ %d,00",howMany,note);
                System.out.println();

            }
            System.out.println("MOEDAS:");
            for(double coin : bankCoins){

                int howMany = (int) (value/coin);

                value = value%coin;
                
                System.out.printf("%d moeda(s) de R$ %.2f",howMany,coin);
                System.out.println();

            }
        }
        input.close();
    }
}

