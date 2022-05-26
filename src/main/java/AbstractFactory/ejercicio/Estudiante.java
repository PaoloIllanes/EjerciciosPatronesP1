package AbstractFactory.ejercicio;

public class Estudiante {
    private boolean inscripcionIngles;
    private boolean inscripcionHistoria;
    private boolean inscripcionLenguaje;
    private String name;

    public Estudiante(String name){
        this.name= name;
    }

    public boolean getInscripcionIngles() {
        return inscripcionIngles;
    }

    public void setInscripcionIngles(boolean inscripcionIngles) {
        this.inscripcionIngles = inscripcionIngles;
    }

    public boolean getInscripcionHistoria() {
        return inscripcionHistoria;
    }

    public void setInscripcionHistoria(boolean inscripcionHistoria) {
        this.inscripcionHistoria = inscripcionHistoria;
    }

    public boolean getInscripcionLenguaje() {
        return inscripcionLenguaje;
    }

    public void setInscripcionLenguaje(boolean inscripcionLenguaje) {
        this.inscripcionLenguaje = inscripcionLenguaje;
    }
    public void showInscriptions(){
        System.out.println("Materias inscritas: ");
        System.out.println("Ingles: "+this.inscripcionIngles);
        System.out.println("Lenguaje: "+this.inscripcionLenguaje);
        System.out.println("Historia: "+this.inscripcionHistoria);

    }
}
