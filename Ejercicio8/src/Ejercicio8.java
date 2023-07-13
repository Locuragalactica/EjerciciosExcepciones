
import entidades.ClassDos;
import entidades.ClassTres;
import entidades.ClassUno;

public class Ejercicio8 {

    public static void main(String[] args) {

        /*
        Indique que se mostrará por pantalla cuando se ejecute cada una de estas clases:
         */
        ClassUno cu = new ClassUno();
        ClassDos cd = new ClassDos();
        ClassTres ct = new ClassTres();

        try {
            System.out.println(cu.metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo() ");
            e.printStackTrace();
        }
        System.out.println("-------------------------------------");

        try {
            System.out.println(cd.metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo() ");
            e.printStackTrace();
        }
        System.out.println("-------------------------------------");
        try {
            System.out.println(ct.metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo() ");
            e.printStackTrace();
        }

    }
}
