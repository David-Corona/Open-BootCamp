package Ejercicio1;
public class Main {
    public static void main(String[] args) {

        //Enteros
        byte tipoByte = 0;
        short tipoShort = 0;
        int tipoInt = 10;
        long tipoLong = 20;

        //Punto flotante
        float tipoFloat = 4.9f;
        double tipoDouble = 9.99d;

        //Caracter
        char tipoChar = 'A';

        //Boolean
        boolean tipoBooleanTrue = true;

        //Cadena de texto
        String tipoString = "David Corona";

        String todosDatos = "Tipos de datos: " +
                    "Byte=" + tipoByte +
                    ", Short=" + tipoShort +
                    ", Int=" + tipoInt +
                    ", Long=" + tipoLong +
                    ", Float=" + tipoFloat +
                    ", Double=" + tipoDouble +
                    ", Char=" + tipoChar +
                    ", Boolean=" + tipoBooleanTrue +
                    ", String='" + tipoString + '\'';

        System.out.println(todosDatos);
    }
}



/*
Enunciado del ejercicio:
Para este primer ejercicio tendréis que realizar lo siguiente:
- Crea un proyecto de Java desde 0
- Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
- Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
 */