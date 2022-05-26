package builder.ejercicio;

public class Plato {
    private String tipoDeCarne;
    private String saborDeRefresco;
    private String guarniciones;
    private String nombrePlato;

    public Plato(){}

    public String getNombrePlato() {
        return nombrePlato;
    }

    public void setNombrePlato(String nombrePlato) {
        this.nombrePlato = nombrePlato;
    }

    public String getTipoDeCarne() {
        return tipoDeCarne;
    }

    public void setTipoDeCarne(String tipoDeCarne) {
        this.tipoDeCarne = tipoDeCarne;
    }

    public String getSaborDeRefresco() {
        return saborDeRefresco;
    }

    public void setSaborDeRefresco(String saborDeRefresco) {
        this.saborDeRefresco = saborDeRefresco;
    }

    public String getGuarniciones() {
        return guarniciones;
    }

    public void setGuarniciones(String guarniciones) {
        this.guarniciones = guarniciones;
    }

    public void showInfo(){
        System.out.println("Plato: "+nombrePlato);
        System.out.println("Carne: "+tipoDeCarne);
        System.out.println("Sabor de refresco: "+saborDeRefresco);
        System.out.println("Guarniciones: "+guarniciones);
        System.out.println("*************************************");

    }


}
