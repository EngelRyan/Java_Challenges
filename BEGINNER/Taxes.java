package BEGINNER;
import java.io.IOException;
import java.util.Scanner;

public class Taxes {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        double salary = input.nextDouble();

        double taxes = 0;

        if (salary>4500) {
            taxes = ((salary-4500)*28)/100;
            salary = salary-(salary-4500);
        }
        if(salary>3000 && salary <= 4500){
            taxes += ((salary-3000)*18)/100;
            salary = salary-(salary-3000);
        }
        if(salary>2000 && salary <= 3000){
            taxes += ((salary-2000)*8)/100;
            salary = salary-(salary-2000);
        }
        
        if(taxes>0){
            System.out.printf("R$ %.2f",taxes);
            System.out.println();
        }
        else{
            System.out.println("Isento");
        }
        input.close();
    }
}
