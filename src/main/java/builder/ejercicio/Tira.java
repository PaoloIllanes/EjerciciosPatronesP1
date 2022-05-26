package builder.ejercicio;

public class Tira extends BuilderPlato {
    @Override
    public void buildNombrePlato() {
        this.plato.setNombrePlato("Tira");
    }

    @Override
    public void buildGuarniciones() {
        this.plato.setGuarniciones("Fideo");
    }

    @Override
    public void buildTipoDeCarne() {
        this.plato.setTipoDeCarne("Tira de Carne");
    }

    @Override
    public void buildSaborDeRefresco() {
        this.plato.setSaborDeRefresco("Coca cola");
    }
}