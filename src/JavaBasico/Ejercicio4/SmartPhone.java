package JavaBasico.Ejercicio4;

public class SmartPhone extends SmartDevice {

    double tamanyoPantalla;

    public SmartPhone() {
    }

    public SmartPhone(String nombre, double precio, double tamanyoPantalla) {
        super(nombre, precio);
        this.tamanyoPantalla = tamanyoPantalla;
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "tamanyoPantalla=" + tamanyoPantalla +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
