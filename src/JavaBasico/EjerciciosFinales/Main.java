package JavaBasico.EjerciciosFinales;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;


public class Main {

    public static void main(String[] args) {
        invertirCadena();
        arrayUnidimensional();
        arrayBidimensional();
        vector();
        dividePorCero();
        arraysList();
        copiarFicheros();
    }

    /*
        Escribe el código que devuelva una cadena al revés.
    */
    private static void invertirCadena() {
        System.out.println("-----------------------\n Cadena invertida\n-----------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un texto para invertir:");

        String texto = scanner.nextLine();
        String textoInvertido = "";

        for (int i = 0; i < texto.length(); i++) {
            textoInvertido = texto.charAt(i) + textoInvertido;
        }
        System.out.println("El texto invertido es: " + textoInvertido);
    }


    /*
        Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
    */
    private static void arrayUnidimensional() {
        System.out.println("-----------------------\n Array Unidimensional\n-----------------------");

        String nombres[] = {"David", "Pepe", "Eustaquio"};

        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }


    /*
        Crea un array bidimensional de enteros y recórrelo,
        mostrando la posición y el valor de cada elemento en ambas dimensiones.
    */
    private static void arrayBidimensional() {
        System.out.println("-----------------------\n Array Bidimensional\n-----------------------");

        int enteros[][] = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int i = 0; i < enteros.length; i++) {
            for (int j = 0; j < enteros[0].length; j++) {
                System.out.print(enteros[i][j] + " ");
            }
            System.out.println();
        }
    }


    /*
        Crea un "Vector" del tipo de dato que prefieras, y añádele 5 elementos.
        Elimina el 2o y 3er elemento y muestra el resultado final.
    */
    private static void vector() {
        System.out.println("-----------------------\n Vector\n-----------------------");

        Vector<String> vector = new Vector<>();
        vector.add("David");
        vector.add("Pepe");
        vector.add("Eustaquio");
        vector.add("Jose");
        vector.add("Paco");
        System.out.println("Vector: " + vector);

        vector.remove(2);
        vector.remove(1);
        System.out.println("Vector tras eliminar 2o y 3er elementos: " + vector);
    }


    /*
        Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
        A continuación, con otro bucle, recórrelo y elimina los numeros pares.
        Por último, vuelve a recorrerlo y muestra el ArrayList final.
    */
    private static void arraysList() {
        System.out.println("-----------------------\n ArrayList\n-----------------------");

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0; i < 10; i++) {
            arrayList.add(i);
        }
        System.out.println("ArrayList: " + arrayList);

        for (int i=0; i < arrayList.size(); i++) {
            if(arrayList.get(i)%2 == 0){
                arrayList.remove(i);
            }
        }
        System.out.println("Eliminados pares: " + arrayList);
    }


    /*
        Crea una función DividePorCero.
        Esta, debe generar una excepción ("throws") a su llamante del tipo ArithmeticException que será capturada.
        Si se dispara la excepción, mostraremos el mensaje "Esto no puede hacerse".
        Finalmente, mostraremos en cualquier caso: "Demo de código".
    */
    private static void dividePorCero() {
        System.out.println("-----------------------\n DividePorCero\n-----------------------");

        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }


    /*
        Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
        La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al fichero dado en "fileOut".
     */
    private static void copiarFicheros() {
        System.out.println("-----------------------\n CopiarFichero\n-----------------------");

        File fileIn = new File("./src/JavaBasico/EjerciciosFinales/Files/fileIn.txt");
        File fileOut = new File("./src/JavaBasico/EjerciciosFinales/Files/fileOut.txt");
        realizarCopia(fileIn, fileOut);
    }

    private static void realizarCopia(File fileIn, File fileOut) {
        try{
            InputStream inFile = new FileInputStream(fileIn);
            byte [] datos = inFile.readAllBytes();
            inFile.close();

            PrintStream outFile = new PrintStream(fileOut);
            outFile.write(datos);
            outFile.close();

        }catch(Exception e){
            System.out.println("Excepcion: " +  e.getMessage());
        }
    }


}