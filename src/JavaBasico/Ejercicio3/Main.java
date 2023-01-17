package JavaBasico.Ejercicio3;

/*
Enunciado del ejercicio:
- En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el resultado final por consola.
- Tened en cuenta que los textos pueden venir de un array de tipo String. Por ejemplo:
- String[] nombres = {"", "", "", ""}
*/

public class Main {

    public static void main(String[] args) {

        String[] nombres = {"David", "Pepe", "Tomás", "Eustaquio"};
        String texto = "";

        System.out.print("Nombres del array: ");
        for (String nombre : nombres) {
            //texto = texto + nombre + " " ;
            texto = texto.concat(nombre + " ");
        }
        System.out.println(texto);
    }

}