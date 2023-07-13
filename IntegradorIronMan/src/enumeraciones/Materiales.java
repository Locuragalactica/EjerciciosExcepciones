package enumeraciones;

public enum Materiales {
    ALUMINIO(50), CARTON(10), ACERO(80), PLOMO(40);

    int resistencia;

    private Materiales(int resistencia) {
        this.resistencia = resistencia;
    }

}
