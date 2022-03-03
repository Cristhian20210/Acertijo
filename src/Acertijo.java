import java.util.Scanner;

public class Acertijo {

    public static void acertijo() {
        System.out.println("Ingresa un entero entre 1 y 10");

        Scanner sc = new Scanner(System.in);

        int response = Integer.valueOf(sc.nextLine());

        while(response != 7) {
            System.out.println("El numero ingresado no es el correcto, sigue adivinando");
            response = Integer.valueOf(sc.nextLine());


        }

        System.out.println("Excelente, has adivinado el numero CHORRI!");


    }
}