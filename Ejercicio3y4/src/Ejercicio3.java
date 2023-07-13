
import entidades.DivisionNumero;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        /*
        Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.
         */
        Scanner leer = new Scanner(System.in);
        DivisionNumero dn = new DivisionNumero();
        int n = 0, n1 = 0, div = 0;

        try {

            System.out.println("Ingrese el primer numero");
            dn.setNum1(leer.next());
            System.out.println("Ingrese el segundo numero");
            dn.setNum2(leer.nextInt());
            n = Integer.parseInt(dn.getNum1());
            n1 = dn.getNum2();
            div = n / n1;
            System.out.println("Sus numeros son: " + n + " y " + n1);
            System.out.println("El resultado de la división es: " + div);
        } catch (NumberFormatException ex) {
            System.out.println("Error de String");;
        } catch (ArithmeticException a) {
            System.out.println("Error Arithmetic");
        } catch (InputMismatchException ae) {
            System.out.println("Error Mismatch");
        }
    }

}
