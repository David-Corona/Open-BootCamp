package JavaAvanzado.Patrones.Estructurales.Adapter;

public class Lightbulb {
    boolean poweredOn = false;
    int voltage = 0;

    public void turnOn(int voltage) {
        poweredOn = true;
        this.voltage = voltage;
        System.out.println("Lightbulb turned on with voltage " + voltage);
    }

    public void turnOff() {
        poweredOn = false;
        this.voltage = 0;
        System.out.println("Lightbulb turned off");
    }

    public boolean isPoweredOn(){
        return poweredOn;
    }
}
