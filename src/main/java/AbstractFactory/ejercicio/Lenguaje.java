package AbstractFactory.ejercicio;

public class Lenguaje implements Materia{
    @Override
    public void showInfo() {
        System.out.println("Descripcion materia lenguaje");

    }

    @Override
    public void inscribir(Estudiante estudiante) {
        estudiante.setInscripcionLenguaje(true);

    }
}
