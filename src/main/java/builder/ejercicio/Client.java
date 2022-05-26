package builder.ejercicio;


public class Client {

    public static void main(String[] args) {
        Chef jose = new Chef();
        BuilderPlato bife = new Bife();
        BuilderPlato lomito = new Lomito();
        BuilderPlato tira = new Tira();

        jose.setBuilder(bife);
        jose.armarComputadora();
        Plato plato1 = jose.getPlatoPreparado();
        plato1.showInfo();

        jose.setBuilder(lomito);
        jose.armarComputadora();
        Plato plato2 = jose.getPlatoPreparado();
        plato2.showInfo();

        jose.setBuilder(tira);
        jose.armarComputadora();
        Plato plato3 = jose.getPlatoPreparado();
        plato3.showInfo();
    }

}
