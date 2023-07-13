package ejercicio7;

import entidades.Persona;
import servicios.ServiciosPersona;

public class Ejercicio1 {

    public static void main(String[] args) {
        /*
Inicializar un objeto de la clase Persona ejercicio 7 de la guía POO, a null y tratar de invocar el
método esMayorDeEdad() a través de ese objeto. Luego, englobe el código con una cláusula
try-catch para probar la nueva excepción que debe ser controlada.
         */

        ServiciosPersona ps = new ServiciosPersona();

        Persona p5 = new Persona(null, null, null);

        try {
            ps.esMayorDeEdad(p5);
        } catch (java.lang.RuntimeException a) {
            System.out.println("Error de conversion");
        }

    }
}
