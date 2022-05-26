package builder.ejercicio;


public abstract class BuilderPlato {

    protected Plato plato;

    public Plato getPlato() {
        return plato;
    }

    public void createPlato() {
        this.plato = new Plato();
    }

    public abstract void buildNombrePlato();
    public abstract void buildGuarniciones();
    public abstract void buildTipoDeCarne();
    public abstract void buildSaborDeRefresco();


}
