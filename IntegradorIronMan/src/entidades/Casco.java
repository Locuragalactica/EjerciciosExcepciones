package entidades;

public class Casco extends Condicion {

    private boolean sintetizador, consola;
    private float energia = 20;

    public Casco(boolean sintetizador, boolean consola) {
        this.sintetizador = sintetizador;
        this.consola = consola;
    }

    public Casco(boolean sintetizador, boolean consola, boolean danio, boolean destruido) {
        super(danio, destruido);
        this.sintetizador = sintetizador;
        this.consola = consola;
    }

}
