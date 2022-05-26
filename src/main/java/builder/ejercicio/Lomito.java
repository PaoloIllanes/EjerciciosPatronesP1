package builder.ejercicio;

public class Lomito extends BuilderPlato{
    @Override
    public void buildNombrePlato() {
        this.plato.setNombrePlato("Lomito");
    }

    @Override
    public void buildGuarniciones() {
        this.plato.setGuarniciones("Arroz");
    }

    @Override
    public void buildTipoDeCarne() {
        this.plato.setTipoDeCarne("Lomo");
    }

    @Override
    public void buildSaborDeRefresco() {
        this.plato.setSaborDeRefresco("Pepsi");
    }
}
