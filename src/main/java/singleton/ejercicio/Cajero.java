package singleton.ejercicio;



public class Cajero {
    private String nombre;
    private Person person;
    private int codigo;


    public Cajero(Person person,String nombre, int codigo){
        this.codigo=codigo;
        this.nombre=nombre;
        this.person=person;
        System.out.println("Cajero: "+nombre);

    }
    public void depositar(int cantidad){

        Ventanilla.getInstance().depositarMonto(cantidad);

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}

