
import java.util.InputMismatchException;
import java.util.Scanner;

public class Prueba {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int n, n3, n4, n5;
    String n2;

    public void metodoC() throws InputMismatchException {
        System.out.println("1- Ingrese un numero");
        n = leer.nextInt();
        try {
            System.out.println("2- Ingrese un numero");
            n2 = leer.next();
            Integer num = Integer.parseInt(n2);
            System.out.println("3- Ingrese un numero");
            n3 = leer.nextInt();
        } catch (NumberFormatException e) {
            System.out.println("4- Error de Numero");
        } catch (InputMismatchException e) {
            System.out.println("5- Error de Letra");
            throw (e);
        } finally {
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.println("6- Ingrese un numero");
            n4 = leer.nextInt();
        }
    }
}
