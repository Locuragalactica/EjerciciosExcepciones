package entidades;

import entidades.Botas.Bota;
import entidades.Guantes.Guante;
import java.util.ArrayList;
import javafx.scene.paint.Material;

public class Armadura {

    private String colorP, colorS;
    //private Material material;
    private float bateria = Float.MAX_VALUE;
    private float reactor;
    private int salud = 100;
    private ArrayList<Bota> botas;
    private ArrayList<Guante> guantes;
    private Casco casco;

    public Armadura() {
    }

    public Armadura(String colorP, String colorS, float reactor, ArrayList<Bota> botas, ArrayList<Guante> guantes, Casco casco) {
        this.colorP = colorP;
        this.colorS = colorS;
        this.reactor = reactor;
        this.botas = botas;
        this.guantes = guantes;
        this.casco = casco;
    }

    public String getColorP() {
        return colorP;
    }

    public void setColorP(String colorP) {
        this.colorP = colorP;
    }

    public String getColorS() {
        return colorS;
    }

    public void setColorS(String colorS) {
        this.colorS = colorS;
    }

    public float getBateria() {
        return bateria;
    }

    public void setBateria(float bateria) {
        this.bateria = bateria;
    }

    public float getReactor() {
        return reactor;
    }

    public void setReactor(float reactor) {
        this.reactor = reactor;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public ArrayList<Bota> getBotas() {
        return botas;
    }

    public void setBotas(ArrayList<Bota> botas) {
        this.botas = botas;
    }

    public ArrayList<Guante> getGuantes() {
        return guantes;
    }

    public void setGuantes(ArrayList<Guante> guantes) {
        this.guantes = guantes;
    }

    public Casco getCasco() {
        return casco;
    }

    public void setCasco(Casco casco) {
        this.casco = casco;
    }

}
