package JavaAvanzado.Patrones.Creacionales.Builder;

public class CocheBuilder {

    Vehiculo vehiculo;

    public CocheBuilder(String marca) {
        vehiculo = new Vehiculo();
        vehiculo.marca = marca;
    }

    public CocheBuilder setPuertas(int puertas) {
        vehiculo.puertas = puertas;
        return this; // retorna la instancia actual del coche
    }

    public CocheBuilder setMotor(String motor) {
        vehiculo.motor = motor;
        return this;
    }

    public Vehiculo build() {
        return this.vehiculo;
    }
}
