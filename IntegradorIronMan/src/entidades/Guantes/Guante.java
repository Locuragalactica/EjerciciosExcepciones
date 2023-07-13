package entidades.Guantes;

import entidades.Condicion;

public class Guante extends Condicion {

    protected boolean repulsor;
    protected float energia = 100;

    public Guante(boolean repulsor) {
        this.repulsor = repulsor;
    }

    public Guante(boolean repulsor, boolean danio, boolean destruido) {
        super(danio, destruido);
        this.repulsor = repulsor;
    }

}
