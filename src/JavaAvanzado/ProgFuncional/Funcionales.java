package JavaAvanzado.ProgFuncional;

import java.util.function.Function;

public class Funcionales {

    // Función de alto nivel. Funcional
     public Function<String, String> toMayus = x -> x.toUpperCase();
     public Function<Integer, Integer> sumador = x -> x.sum(x, x);

    public void pruebas() {
        System.out.println(toMayus.apply("David"));
        System.out.println(sumador.apply(5));

        Saluda(toMayus, "David");
    }

    //función cuyo parámetro de entrada es una función
    public void Saluda(Function<String, String> miFuncion, String nombre) {
        miFuncion.apply(nombre);
    }



    // Método. Esto sería equivalente a toMayus, pero imperativo.
    public String toMayusculas(String x) {
        return x.toUpperCase();
    }
}