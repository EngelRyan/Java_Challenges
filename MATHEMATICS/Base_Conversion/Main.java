import java.io.IOException;
import java.util.Scanner;;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        input.nextLine();

        String[] fomStrings = new String[n];

        for(int i = 0; i<n; i++){
            
            String number = input.nextLine();

            String[] value = number.split(" ");

            if(number.contains("bin")){
                // Conversão de binário para decimal
                int decimalValue = Integer.parseInt(value[0], 2);
                
                //Conversão de decimal para hexadecimal
                String hexValue = Integer.toHexString(decimalValue);

                fomStrings[i] = String.valueOf(decimalValue) + " dec\n" + hexValue + " hex";
            }
            else if(number.contains("dec")){
                int decimalValue = (Integer.parseInt(value[0]));

                // Conversão de decimal para hexadecimal
                String hexValue = Integer.toHexString(decimalValue);

                // Conversão de decimal para binário
                String binaryValue = Integer.toBinaryString(decimalValue);

                fomStrings[i] = hexValue + " hex\n" + binaryValue + " bin";
            }
            else if(number.contains("hex")){
                String hexValue = value[0];

                // Conversão de hexadecimal para decimal
                int decimalValue = Integer.parseInt(hexValue, 16);

                // Conversão de decimal para binário
                String binaryValue = Integer.toBinaryString(decimalValue);

                fomStrings[i] = String.valueOf(decimalValue) + " dec\n" + binaryValue + " bin";
            }
        }
        int c = 1;
        for(String f : fomStrings){
            System.out.println("Case "+ c+ ":");
            System.out.println(f);
            System.out.println();
            c++;
        }
        input.close();
    }
}
