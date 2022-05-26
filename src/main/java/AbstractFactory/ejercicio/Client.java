package AbstractFactory.ejercicio;


public class Client {
    public static void main(String []args) {
        Estudiante estudiante = new Estudiante("Jose");
        Materia materia = FactoryMateria.make("historia");
        materia.inscribir(estudiante);
        estudiante.showInscriptions();
        materia = FactoryMateria.make("lenguaje");
        materia.inscribir(estudiante);
        estudiante.showInscriptions();
        materia = FactoryMateria.make("ingles");
        materia.inscribir(estudiante);
        estudiante.showInscriptions();

    }
}
