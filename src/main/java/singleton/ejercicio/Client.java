package singleton.ejercicio;

public class Client {

    public static void main(String[]args){
        Person person1= new Person("Juan");
        Cajero cajero1= new Cajero(person1,"Jose",34324324);
        cajero1.depositar(200);

        Person person2= new Person("jose");
        Cajero cajero2= new Cajero(person2,"diego",5435435);
        cajero2.depositar(200);

        Person person3= new Person("pablo");
        Cajero cajero3= new Cajero(person3,"juan",2131312);
        cajero3.depositar(200);

        Person person4= new Person("diego");
        Cajero cajero4= new Cajero(person4,"alejandro",12313123);
        cajero4.depositar(200);
    }

}
