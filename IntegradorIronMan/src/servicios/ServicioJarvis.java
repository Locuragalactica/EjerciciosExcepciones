package servicios;

import entidades.Armadura;
import entidades.Botas.BotaDer;
import entidades.Botas.BotaIzq;
import entidades.Casco;
import entidades.Guantes.GuanteDer;
import entidades.Guantes.GuanteIzq;
import java.util.Scanner;

public class ServicioJarvis {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    float consumo;

    public void menu() {
        Armadura a1 = new Armadura();
        crearArmadura(a1);
        int rta;
        String rta2 = "";
        do {
            System.out.println("\u001B[41m ----------MENU----------");
            System.out.println("\u001B[41m");
            System.out.println("\u001B[41m1- Caminar ");
            System.out.println("\u001B[41m2- Correr");
            System.out.println("\u001B[41m3- Volar");
            System.out.println("\u001B[41m4- Propulsarse");
            System.out.println("\u001B[41m5- Disparar");
            System.out.println("\u001B[41m6- Salir");

            rta = leer.nextInt();
            if (rta == 6) {
                System.out.println("¿Esta seguro que desea salir? S/N");
                rta2 = leer.next();
                if (rta2.equals("s")) {
                    break;
                }
            }
            switch (rta) {
                case 1:
                    System.out.println("-------------------------------------");
                    System.out.println("¿Cuanto tiempo camino?");
                    int min = leer.nextInt();
                    gastoEnergia(min, a1.getBotas().g);
                    System.out.println("-------------------------------------");
                    break;
                case 2:
                    System.out.println("-------------------------------------");

                    System.out.println("-------------------------------------");

                    break;
                case 3:
                    System.out.println("-------------------------------------");

                    System.out.println("-------------------------------------");

                    break;
                case 4:
                    System.out.println("-------------------------------------");

                    System.out.println("-------------------------------------");

                    break;
            }

        } while (!rta2.equals("s"));
    }

    public void crearArmadura(Armadura a1) {
        BotaIzq bIzq = new BotaIzq(false, false, false);
        BotaDer bDer = new BotaDer(false, false, false);
        GuanteIzq gIzq = new GuanteIzq(false, false, false);
        GuanteDer gDer = new GuanteDer(false, false, false);
        Casco casco = new Casco(false, false, false, false);
        a1.setColorP("Rojo");
        a1.setColorS("Azul");
        a1.setReactor(1000);
        a1.getBotas().add(bDer);
        a1.getBotas().add(bIzq);
        a1.getGuantes().add(gIzq);
        a1.getGuantes().add(gDer);
        a1.setCasco(casco);

    }

    public void gastoEnergia(int tiempo, float energia) {
        consumo = tiempo * energia;
    }

}
