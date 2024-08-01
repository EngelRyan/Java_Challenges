import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double salary = input.nextDouble();

        double taxes = 0;

        if (salary>4500) {
            taxes = ((salary-4500)*28)/100;
            System.out.println(taxes);
            salary = salary-(salary-4500);
            System.out.println(salary);
        }
        else if(salary>3000 && salary <= 4500){
            taxes = ((salary-3000)*18)/100;
            System.out.println(taxes);
            salary = salary-(salary-3000);
            System.out.println(salary);
        }
       
        input.close();
    }
}
