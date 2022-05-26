package builder.ejercicio;


public class Chef {
    private BuilderPlato builder;

    public Plato getPlatoPreparado() {
        return builder.getPlato();
    }

    public void setBuilder(BuilderPlato builder) {
        this.builder = builder;
    }

    public void armarComputadora() {
        this.builder.createPlato();
        this.builder.buildNombrePlato();
        this.builder.buildGuarniciones();
        this.builder.buildTipoDeCarne();
        this.builder.buildSaborDeRefresco();


    }
}
