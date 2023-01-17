package JavaBasico.Ejercicio4;

public class SmartDevice {

    String nombre;
    double precio;

    public SmartDevice(){

    }

    public SmartDevice(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String toString() {
        return "SmartDevice{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
