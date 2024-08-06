import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        String startDay = input.nextLine();
        String startTime = input.nextLine();
        String endDay = input.nextLine();
        String endTime = input.nextLine();

        //Pegando o dia que começa
        String[] splitTime = startDay.split(" ");
        int startSeconds = Integer.parseInt(splitTime[1].trim())*86400;
        //Pegando o tempo que começa
        splitTime = startTime.split(":");
        int t = 3600;
        for(String time : splitTime){
            startSeconds += Integer.parseInt(time.trim())*t;
            t /= 60;
        }

        //Pegando o dia que termina
        splitTime = endDay.split(" ");
        int endSeconds = Integer.parseInt(splitTime[1].trim())*86400;
        //Pegando o tempo que termina
        splitTime = endTime.split(":");
        t = 3600;
        for(String time : splitTime){
            endSeconds += Integer.parseInt(time.trim())*t;
            t /= 60;
        }
        int eventTime = endSeconds - startSeconds;

        if (eventTime <= 0) {
            eventTime += 24 * 3600;
        }

        int days = eventTime/86400;
        int hours = (eventTime%86400)/3600;
        int min = ((eventTime%86400)%3600)/60;
        int sec = ((eventTime%86400)%3600)%60;

        System.out.println(days + " dia(s)");
        System.out.println(hours + " hora(s)");
        System.out.println(min + " minuto(s)");
        System.out.println(sec + " segundo(s)");
    }
}