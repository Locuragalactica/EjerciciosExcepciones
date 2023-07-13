package entidades;

public class Codigo {

    private int[] cod = new int[3];

    public Codigo() {
    }

    public int[] getCod() {
        return cod;
    }

    public void setCod(int[] cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        return "Codigo{" + "cod=" + cod + '}';
    }

}
