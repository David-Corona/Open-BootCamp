package JavaAvanzado.Patrones.Creacionales.Prototype;

public class Coche {
    public String marca;
    public String modelo;
    public int puertas;

    public Coche(){}

    // creo nuevo coche y le asigno l
    public Coche clonar() {
        Coche clon = new Coche();
        clon.marca = this.marca;
        clon.modelo = this.modelo;
        clon.puertas = this.puertas;
        return clon;
    }
}
