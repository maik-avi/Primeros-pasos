import java.util.Scanner;
import java.util.Random;

public class advinarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        System.out.println("Intenta adivinar un numero de l'1 al 10: ");

        int triades = 5;



        for (int i = 0; i < triades; i++) {
            int numTriat = scanner.nextInt();
            if (numTriat == randomNumber){
                System.out.println("Enhorabona!");
                break;

            }
                if (numTriat > randomNumber) {
                    System.out.println("El numero es menor");
                    System.out.println("Tria de nou: ");
                } else  {
                    System.out.println("El numero es mayor");
                    System.out.println("Tria de nou: ");
                }


        }
        System.out.println("El numero era: " + randomNumber);
    }
}
