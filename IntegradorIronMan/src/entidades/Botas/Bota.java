package entidades.Botas;

import entidades.Condicion;

public class Bota extends Condicion {

    protected boolean propulsor;
    protected float energia = 100;

    public Bota(boolean propulsor) {
        this.propulsor = propulsor;
    }

    public Bota(boolean propulsor, boolean danio, boolean destruido) {
        super(danio, destruido);
        this.propulsor = propulsor;
    }

    public boolean isPropulsor() {
        return propulsor;
    }

    public float getEnergia() {
        return energia;
    }

    public boolean isDanio() {
        return danio;
    }

    public boolean isDestruido() {
        return destruido;
    }

}
