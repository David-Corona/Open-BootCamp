package JavaAvanzado.Recursion;

import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        System.out.println("Suma iterativa: " + sumaIterativa(5));
        System.out.println("Suma funcional: " + sumaRecursiva(5));
        System.out.println("Suma funcional: " + sumaFuncional(5));

        System.out.println("Tail Recursion:");
        tailRecursion(5);
        System.out.println("Head Recursion");
        headRecursion(5);

        long tiempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            sumaIterativa(100); // probar distintas operaciones para ver diferencia de tiempo
        }
        long tiempoFinal = System.currentTimeMillis();
        System.out.println("MS en total: " + (tiempoFinal - tiempoInicial));;
    }

    public static int sumaIterativa(int numero) {
        int resultado = 0;
        for (int i = 1; i <= numero; i++) {
            resultado += i;
        }
        return resultado;
    }

    public static int sumaRecursiva(int numero) {
        if (numero == 1) { // sentencia de control o punto de salida
            return 1;
        }
        return numero + sumaRecursiva(numero - 1);
    }

    // Recursividad funcional
    public static int sumaFuncional(int numero) {
        return IntStream.rangeClosed(1, numero)
                .reduce(0, (a, b) -> a + b);
    }

    // imprime > iteración > imprime > iteración > etc
    public static void tailRecursion(int valor) {
        if (valor == 0) {
            return;
        }

        System.out.println(valor);
        tailRecursion(valor - 1);
    }

    // 5 iteraciones, y conforme va saliendo va impriendo
    public static void headRecursion(int valor) {
        if (valor == 0) {
            return;
        }
        headRecursion(valor - 1);
        System.out.println(valor);
    }


}
