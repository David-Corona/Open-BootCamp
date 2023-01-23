package JavaAvanzado.Patrones.Creacionales.Factory;

/*
Factory - para crear una jerarquia de clases y utilizar una u otra de forma transparente
Ejemplo: Factoria que según el país en el que estemos, dará un precio u otro.
 */

public class Main {
    public static void main(String[] args) {
        PrecioFactory precio = new PrecioFactory("España");
        System.out.println(precio.getPrecio());
        PrecioFactory precio2 = new PrecioFactory("USA");
        System.out.println(precio2.getPrecio());
        PrecioFactory precio3 = new PrecioFactory("UK");
        System.out.println(precio3.getPrecio());
    }
}
