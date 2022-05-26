package AbstractFactory.ejercicio;

public class Historia implements Materia{


    @Override
    public void showInfo() {
        System.out.println("Descripcion materia historia");

    }

    @Override
    public void inscribir(Estudiante estudiante) {
        estudiante.setInscripcionHistoria(true);

    }
}
