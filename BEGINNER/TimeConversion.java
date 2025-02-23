package BEGINNER;
import java.io.IOException;
import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        //Receive seconds
        int seg = input.nextInt();

        //Ternary operator(assigns value to a variable according to the expressed condition)
        int hours = (seg>=3600)? seg/3600:0;
        seg = seg%3600;
        int min = (seg>=60)? seg/60:0;
        seg = seg%60;
        
        System.out.printf("%d:%d:%d",hours,min,seg);
        System.out.println();

        input.close();
    }

}