package JavaAvanzado.Patrones.Creacionales.Prototype;

/*
Prototype - una clase se clona a si misma => el clon hereda tod0 de la version previa
 */

public class main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.marca = "Ford";
        coche.modelo = "Mustang";
        coche.puertas = 5;
        System.out.println(coche.marca + " " + coche.modelo + " " + coche.puertas);

        Coche clonado = coche.clonar();
        clonado.puertas = 3;
        System.out.println(clonado.marca + " " + clonado.modelo + " " + clonado.puertas);
    }
}
