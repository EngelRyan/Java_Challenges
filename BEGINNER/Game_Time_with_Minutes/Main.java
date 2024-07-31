
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);

        int startHour = input.nextInt()*3600;
        int startMin = input.nextInt()*60;
        int endHour = input.nextInt()*3600;
        int endMin = input.nextInt()*60;

        int gameHours = (endHour+endMin)-(startHour+startMin);
        int temp = gameHours;
        gameHours /= 3600;
        int gameMin = temp%3600;
        gameMin /= 60;
        if(gameHours == 0 && gameMin == 0)System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");

        else System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTOS(S)",gameHours,gameMin);

        System.out.println();

        input.close();
    }

}
