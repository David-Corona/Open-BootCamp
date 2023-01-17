package JavaBasico.Ejercicio4;

public class SmartWatch extends SmartDevice {

    double peso;

    public SmartWatch() {

    }

    public SmartWatch(String nombre, double precio, double peso) {
        super(nombre, precio);
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "peso=" + peso +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
