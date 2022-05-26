package Prototype.ejercicio;

public class Contrato implements IContrato{
private int sueldo;
private int cargaHoraria;
private boolean cursoEducacionSuperior;
private boolean marcadoBiometrico;
private String horaDeEntrada;
private String horaDeSalida;
private Docente docente;
private boolean accesoALaPlataforma;

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public boolean isCursoEducacionSuperior() {
        return cursoEducacionSuperior;
    }

    public void setCursoEducacionSuperior(boolean cursoEducacionSuperior) {
        this.cursoEducacionSuperior = cursoEducacionSuperior;
    }

    public boolean isMarcadoBiometrico() {
        return marcadoBiometrico;
    }

    public void setMarcadoBiometrico(boolean marcadoBiometrico) {
        this.marcadoBiometrico = marcadoBiometrico;
    }

    public String getHoraDeEntrada() {
        return horaDeEntrada;
    }

    public void setHoraDeEntrada(String horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }

    public String getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(String horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public boolean isAccesoALaPlataforma() {
        return accesoALaPlataforma;
    }

    public void setAccesoALaPlataforma(boolean accesoALaPlataforma) {
        this.accesoALaPlataforma = accesoALaPlataforma;
    }

    @Override
    public Object clone() {
        Docente cloneD = new Docente(this.docente.getNombre(),this.docente.getApellido());

        Contrato clone = new Contrato();
        clone.setCargaHoraria(this.cargaHoraria);
        clone.setDocente(cloneD);
        clone.setCursoEducacionSuperior(this.cursoEducacionSuperior);
        clone.setSueldo(this.sueldo);
        clone.setHoraDeEntrada(this.horaDeEntrada);
        clone.setHoraDeSalida(this.horaDeSalida);
        clone.setMarcadoBiometrico(this.marcadoBiometrico);
        clone.setAccesoALaPlataforma(this.accesoALaPlataforma);
        return clone;
    }
    public void showInfo(){
        System.out.println("Docente");
        System.out.println("Nombre: "+docente.getNombre());
        System.out.println("Apellido: "+docente.getApellido());
        System.out.println("sueldo: "+sueldo);
        System.out.println("cargaHoraria: "+cargaHoraria);
        System.out.println("cursoEducacionSuperior: "+cursoEducacionSuperior);
        System.out.println("marcadoBiometrico: "+marcadoBiometrico);
        System.out.println("horaDeEntrada: "+horaDeEntrada);
        System.out.println("horaDeSalida: "+horaDeSalida);
        System.out.println("********************************");






    }
}
