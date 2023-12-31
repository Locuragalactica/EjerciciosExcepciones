package entidades;

public class Persona {

    /*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura.
     */
    private String nombre, sexo;
    private Integer edad;

    //Un constructor por defecto.
    public Persona() {
    }

    // Un constructor con todos los atributos como parámetro.
    public Persona(String nombre, String sexo, Integer edad) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
    }

    //Métodos getters y setters de cada atributo.
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

}
