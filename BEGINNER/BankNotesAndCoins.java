package BEGINNER;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;;
 
public class BankNotesAndCoins {
 
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        double value = input.nextDouble();

        int[] bankNotes = {100,50,20,10,5,2};

        double[] bankCoins = {100,50,25,10,5,1};

        
        System.out.println("NOTAS:");
        if(value>0 && value < 1000000.00){
            for (int note : bankNotes) {

                int howMany = (int) (value/note);

                value = value%note;
                 
                System.out.printf("%d nota(s) de R$ %d.00",howMany,note);
                System.out.println();

            }
            BigDecimal valuDecimal = new BigDecimal(value);
            BigDecimal result = valuDecimal.multiply(new BigDecimal(100));
            value = result.setScale(2,RoundingMode.HALF_UP).doubleValue();

            System.out.println("MOEDAS:");
            for(double coin : bankCoins){

                int howMany = (int) (value/coin);
                value %= coin;
                coin /= 100;
               
                String coins = String.format("%d moeda(s) de R$ %.2f", howMany,coin);
                System.out.print(coins.replace(",", "."));
                System.out.println();

            }
        }
        input.close();
    }
}

