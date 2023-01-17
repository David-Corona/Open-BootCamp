package JavaBasico.Ejercicio2;

/*
Enunciado del ejercicio:
-Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
*/

public class Main {

    public static void main(String[] args) {
        double precio = 10;
        double precioTotal = getPrecioConIVA(precio);
        System.out.println("El precio con IVA es: " + precioTotal + "€");
    }

    static double getPrecioConIVA(double precioSinIVA) {
        return precioSinIVA * 1.21;
    }

}
