package JavaAvanzado.ProgFuncional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // Funcionales f = new Funcionales();
        // f.pruebas();

        testeoStream();
    }

    private static void testeoStream() {
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Paco");
        nombres.add("David");
        nombres.add("Eustaquio");
        nombres.add("Pepe");

        // for (String nombre : nombres) {
        //    System.out.println(nombre);
        // }

        // nombres.stream().forEach(x -> System.out.println(x));

        Stream<String> valores = nombres.stream()
                .map(x -> x.toUpperCase())
                .filter(x -> x.startsWith("P")); //descarta lo que no cumpla

        valores.forEach(x -> System.out.println(x));
        // valores.forEach(x -> System.out.println(x)); // daría error al haberse consumido ya el Stream



        int []numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // De forma funcional
        var stNumeros = Arrays.stream(numeros);
        var resultado = stNumeros
                .map(x -> x * 2)
                .filter(x -> x % 2 == 0)
                .reduce(0, (x, y) -> x + y);
        System.out.println("Suma total: " + resultado);

        // De forma imperativa
        int sumatotal = 0;
        for (int numero : numeros) {
            numero = numero * 2;
            if (numero % 2 != 0) {
                continue;
            }
            sumatotal += numero;
        }
        System.out.println("Suma total: " + sumatotal);
    }

}