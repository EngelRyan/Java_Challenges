
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int startHour = input.nextInt()*3600;
        int startMin = input.nextInt()*60;
        int endHour = input.nextInt()*3600;
        int endMin = input.nextInt()*60;

        int gameTime = (startHour+startMin)-(endHour+endMin);
        


        input.close();
    }

}
