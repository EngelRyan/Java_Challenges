import java.io.IOException;
import java.util.Scanner;;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        while(n-->0){

            String number = input.nextLine();

            String[] value = number.split(" ");
            

            if(number.contains("bin")){
                binary(value[0]);
            }
            else if(number.contains("dec")){
                decimal(Integer.parseInt(value[0]));
            }
            else if(number.contains("hex")){
                hexadecimal(value[0]);
            }
        }
    }

    public static void binary(String binaryString){
        // Conversão de binário para decimal
        int decimalValue = Integer.parseInt(binaryString, 2);
        System.out.printf("%d dec",decimalValue);
        System.out.println();
        // Conversão de decimal para hexadecimal
        String hexValue = Integer.toHexString(decimalValue);
        System.out.printf("%s hex",hexValue.toUpperCase());
    }

    public static void decimal(int decimalValue){
        // Conversão de decimal para hexadecimal
        String hexString = Integer.toHexString(decimalValue);
        System.out.printf("%s hex",hexString.toUpperCase());
        System.out.println();
        // Conversão de decimal para binário
        String binaryString = Integer.toBinaryString(decimalValue);
        System.out.printf("%s bin",binaryString);
    }

    public static void hexadecimal(String hexString){
        // Conversão de hexadecimal para decimal
        int decimalValue = Integer.parseInt(hexString, 16);
        System.out.printf("%s dec",decimalValue);
        System.out.println();
        // Conversão de decimal para binário
        String binaryString = Integer.toBinaryString(decimalValue);
        System.out.printf("bin",binaryString);
    }
}
