
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int n, n2, n3, n4, n5;

    public void metodoA() {

        System.out.println("1- Ingrese un numero");
        n = leer.nextInt();
        System.out.println("2- Ingrese un numero");
        n2 = leer.nextInt();
        try {
            System.out.println("3- Ingrese un numero");
            n3 = leer.nextInt();
            System.out.println("4- Ingrese un numero");
            n4 = leer.nextInt();
        } catch (InputMismatchException a) {
            System.out.println("6- Numero no ingresado");
        }
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("5- Ingrese un numero");
        n5 = leer.nextInt();
    }

    public void metodoB() {

        System.out.println("1- Ingrese un numero");
        n = leer.nextInt();
        try {
            System.out.println("2- Ingrese un numero");
            n2 = leer.nextInt();
        } catch (InputMismatchException a) {
            System.out.println("3- Numero no ingresado");
        } finally {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("4- Ingrese un numero");
            n4 = leer.nextInt();
        }

    }
}
