import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        int startHour = input.nextInt() * 3600;
        int startMin = input.nextInt() * 60;
        int endHour = input.nextInt() * 3600;
        int endMin = input.nextInt() * 60;

        int gameSeconds = (endHour + endMin) - (startHour + startMin);

        if (gameSeconds <= 0) {
            gameSeconds += 24 * 3600;
        }

        int gameHours = gameSeconds / 3600;
        int gameMin = (gameSeconds % 3600) / 60;

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", gameHours, gameMin);

        input.close();
    }
}
