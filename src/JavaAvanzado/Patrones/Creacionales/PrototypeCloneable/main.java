package JavaAvanzado.Patrones.Creacionales.PrototypeCloneable;

/*
Prototype - Implementando la interfaz Cloneable
*/

public class main {
    public static void main(String[] args) {
        Coche coche = new Coche();
        coche.marca = "Ford";
        coche.modelo = "Mustang";
        coche.puertas = 5;
        System.out.println(coche.marca + " " + coche.modelo + " " + coche.puertas);

        try {
            Coche clonado = coche.clonar();
            clonado.puertas = 3;
            System.out.println(clonado.marca + " " + clonado.modelo + " " + clonado.puertas);
        } catch (CloneNotSupportedException e){
            System.out.println("No se puede clonar: " + e.getMessage());
        }
    }
}