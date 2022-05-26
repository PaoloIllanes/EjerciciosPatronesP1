package Prototype.ejercicio;

public class Client {
    public static void main(String[]args){

        Docente docente1 = new Docente("Jose","Perez");
        Docente docente2 = new Docente("Rene","Puente");
        Docente docente3 = new Docente("Juan","Galindo");


        Contrato template = new Contrato();
        template.setMarcadoBiometrico(false);
        template.setSueldo(5000);
        template.setCargaHoraria(80);
        template.setAccesoALaPlataforma(true);
        template.setCursoEducacionSuperior(true);
        template.setHoraDeSalida("18:00");
        template.setHoraDeEntrada("8:00");
        template.setDocente(new Docente("",""));

        Contrato  contrato1 = (Contrato) template.clone();
        contrato1.setDocente(docente1);
        contrato1.showInfo();

        Contrato  contrato2 = (Contrato) template.clone();
        contrato2.setDocente(docente2);
        contrato2.showInfo();

        Contrato  contrato3 = (Contrato) template.clone();
        contrato3.setDocente(docente3);
        contrato3.showInfo();


    }

}
