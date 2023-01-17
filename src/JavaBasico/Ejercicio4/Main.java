package JavaBasico.Ejercicio4;

/*
Enunciado del ejercicio:
- En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
- Agregaréis atributos tal cual tendrían esos objetos en la realidad.
- Crear constructor vacío y con todos los parámetros para cada clase.
- Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */

public class Main {

    public static void main(String[] args) {

        SmartDevice watch1 = new SmartWatch("casio", 20, 4.5);
        SmartDevice phone1 = new SmartPhone("Huawei X", 120, 9);
        System.out.println(watch1);
        System.out.println(phone1);
    }

}
