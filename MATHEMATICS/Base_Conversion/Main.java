import java.io.IOException;
import java.util.Scanner;;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        input.nextLine();

        String[] fomStrings = new String[2];

        while(n-->0){

            String number = input.nextLine();

            String[] value = number.split(" ");

            if(number.contains("bin")){
                // Conversão de binário para decimal
                int decimalValue = Integer.parseInt(value[0], 2);
                
                //Conversão de decimal para hexadecimal
                String hexValue = Integer.toHexString(decimalValue);

                fomStrings[0] = String.valueOf(decimalValue) + " dec";
                fomStrings[1] = hexValue + " hex";
            }
            else if(number.contains("dec")){
                int decimalValue = (Integer.parseInt(value[0]));

                // Conversão de decimal para hexadecimal
                String hexValue = Integer.toHexString(decimalValue);

                // Conversão de decimal para binário
                String binaryValue = Integer.toBinaryString(decimalValue);
                System.out.printf("%s bin",binaryValue);

                fomStrings[0] = hexValue + " hex";
                fomStrings[1] = binaryValue + " bin";
            }
            else if(number.contains("hex")){
                String hexValue = value[0];

                // Conversão de hexadecimal para decimal
                int decimalValue = Integer.parseInt(hexValue, 16);

                // Conversão de decimal para binário
                String binaryValue = Integer.toBinaryString(decimalValue);

                fomStrings[0] = String.valueOf(decimalValue) + " dec";
                fomStrings[1] = binaryValue + " bin";

            }
        }
        for(String f : fomStrings){
            System.out.println(f);
        }
        input.close();
    }
}
