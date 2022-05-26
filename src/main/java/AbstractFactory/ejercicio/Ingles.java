package AbstractFactory.ejercicio;

public class Ingles implements Materia{
    @Override
    public void showInfo() {
        System.out.println("Descripcion materia ingles");

    }

    @Override
    public void inscribir(Estudiante estudiante) {
        estudiante.setInscripcionIngles(true);

    }
}
