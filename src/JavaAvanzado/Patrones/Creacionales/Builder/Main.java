package JavaAvanzado.Patrones.Creacionales.Builder;

/*
Builder - permite construir objetos complejos paso a paso

 */

public class Main {
    public static void main(String[] args) {
        // Vehiculo vehiculo = new Vehiculo();
        Vehiculo coche = new CocheBuilder("Ford")
                .setPuertas(5) // gracias al return this
                .setMotor("Electrico")
                .build();

        System.out.println("Marca: " + coche.getMarca() +
                "\nPuertas: " + coche.getPuertas() +
                "\nMotor: " + coche.getMotor());

    }
}
