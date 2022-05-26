package singleton.ejercicio;


public class Ventanilla {
    private static Ventanilla ventanilla;
    private int saldo;

    private Ventanilla(){}


    public void consultarSaldo(){
        System.out.println("Saldo actual:"+saldo );
    }

    public static Ventanilla getInstance(){
        if (ventanilla==null)
            ventanilla= new Ventanilla();
        return ventanilla;
    }

    public void depositarMonto(int cantidad){
        if(cantidad>0){
            saldo+=cantidad;
            System.out.println("Se depositaron : "+cantidad+" Bs");
            consultarSaldo();

        }else{
            System.out.println("La cantidad introducida no es valida");
        }

    }


}
