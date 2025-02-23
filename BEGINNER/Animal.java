import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);

        String vertebrate = input.nextLine();
        String typeClass = input.nextLine();
        String food = input.nextLine();

        classify(vertebrate,typeClass,food);

        input.close();
    }
    public static void classify(String vertebrate, String typeClass, String food){

        if (vertebrate.equals("vertebrado")) {

            if(typeClass.equals("ave")){

                if (food.equals("carnivoro")) {
                    System.out.println("aguia");
                }
                else{
                   System.out.println("pomba"); 
                }
            }
            else{
                if (food.equals("onivoro")) {
                    System.out.println("homem");
                }
                else{
                    System.out.println("vaca");
                }
            }
        }
        else{
            if (typeClass.equals("inseto")) {

                if (food.equals("hematofago")) {
                    System.out.println("pulga");
                }
                else{
                    System.out.println("lagarta");
                }
                
            }
            else{
                if (food.equals("hematofago")) {
                    System.out.println("sanguessuga");
                }
                else{
                    System.out.println("minhoca");
                }
            }
        }
    }
}