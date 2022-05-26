package AbstractFactory.ejercicio;

public class FactoryMateria {
    public static Materia make(String tipo) {
        Materia materia ;
        switch (tipo) {

            case "historia":
                materia = new Historia();
                break;
            case "ingles":
                materia = new Ingles();
                break;
            case "lenguaje":
                materia = new Lenguaje();
                break;
            default: materia = new Lenguaje();
                break;


        }
        return materia;
    }
}
