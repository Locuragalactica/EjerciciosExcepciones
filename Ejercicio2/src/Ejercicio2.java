
import entidades.Codigo;

public class Ejercicio2 {

    public static void main(String[] args) {

        /*
        Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
         */
        Codigo codi = new Codigo();

        try {
            for (int i = 0; i < 10; i++) {
                codi.getCod()[i] = i;
            }
        } catch (java.lang.ArrayIndexOutOfBoundsException a) {
            System.out.println("Error de rango");
        }

    }

}
