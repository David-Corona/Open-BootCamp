package JavaAvanzado.Patrones.Estructurales.Adapter;

/*
Adapter/Adaptador - Clase intermedia que hace que multiples clases que no tengan la misma implementación, puedan trabajar coherentemente
Ejemplo: código legacy que queramos ampliar con nuevas funcionalidades
Este ejemplo, queremos que las 3 clases funcionen de la misma forma a pesar de que lightbulb tenga otros atrib/metodos
*/

public class Main {
    public static void main(String[] args) {
        Horno horno = new Horno();
        Lampara lampara = new Lampara();
        PowerAdapter lightbulb = new PowerAdapter();

        enciende(horno);
        // enciende(lampara);
        enciende(lightbulb);

        System.out.println("Horno encendido: " + estaEncendida(horno));
        System.out.println("Lámpara encendida: " + estaEncendida(lampara));
        System.out.println("Lightbulb encendido: " + estaEncendida(lightbulb));
    }

    public static void enciende(Enchufable enchufable){
        enchufable.enciende();
    }

    public static void apaga(Enchufable enchufable){
        enchufable.apaga();
    }

    public static boolean estaEncendida(Enchufable enchufable){
        return enchufable.estaEncendido();
    }
}
