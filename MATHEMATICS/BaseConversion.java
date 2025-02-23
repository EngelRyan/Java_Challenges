package MATHEMATICS;
import java.util.Scanner;;

public class BaseConversion {

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
        for(int i = 1; i<fomStrings.length+1; i++){
            System.out.println("Case "+ i +":");
            System.out.println(fomStrings[i-1]);
            System.out.println();
        }
        input.close();
    }
}
