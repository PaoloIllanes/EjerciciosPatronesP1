package Prototype.ejercicio;

public class Docente {
    private String nombre;
    private String apellido;

    public Docente(String nombre, String apellido){

        this.apellido= apellido;
        this. nombre= nombre;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
