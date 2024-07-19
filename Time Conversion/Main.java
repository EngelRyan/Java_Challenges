import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        //Receive seconds
        int sec = input.nextInt();

        //Ternary operator(assigns value to a variable according to the expressed condition)
        int hours = (sec>3600)? sec/3600:0;
        sec = sec%3600;
        int min = (sec>60)? sec/60:0;
        sec = sec%60;
        
        System.out.printf("%d:%d:%d",hours,min,sec);
        System.out.println();

        input.close();
    }

}