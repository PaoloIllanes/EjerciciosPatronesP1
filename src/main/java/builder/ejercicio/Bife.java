package builder.ejercicio;

public class Bife extends BuilderPlato{
    @Override
    public void buildNombrePlato() {
        this.plato.setNombrePlato("Bife");
    }

    @Override
    public void buildGuarniciones() {
        this.plato.setGuarniciones("Papas Fritas");
    }

    @Override
    public void buildTipoDeCarne() {
        this.plato.setTipoDeCarne("Bife");
    }

    @Override
    public void buildSaborDeRefresco() {
        this.plato.setSaborDeRefresco("Coca cola");
    }
}
