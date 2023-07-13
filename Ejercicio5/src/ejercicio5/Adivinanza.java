package ejercicio5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Adivinanza {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int num = (int) (Math.random() * 500);
    int adv;
    int cont = 0;

    public void program() {
//        System.out.println(num);
        do {
            try {
                ingresarNumero();
                cont++;
                System.out.println("Can Int: " + cont);
            } catch (InputMismatchException a) {
                System.out.println("Error, usted no ha ingresado un numero.");
                cont++;
                System.out.println("Can Int: " + cont);
            }
        } while (adv != num);
        System.out.println("Su cantidad de intentos fue de: " + cont);
    }

    public int ingresarNumero() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Adivine el número del 1 al 500:");
        adv = leer.nextInt();
        if (adv < num) {
            System.out.println("El número que desea adivinar es mayor que el suyo.");
        } else if (adv > num) {
            System.out.println("El número que desea adivinar es menor que el suyo.");
        } else {
            System.out.println("Usted ha adivinado el numero");
        }
        return adv;
    }
}
