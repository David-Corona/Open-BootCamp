package JavaAvanzado.Patrones.Estructurales.Adapter;

public class Lampara implements Enchufable{
    boolean encendido = false;

    public void enciende(){
        encendido = true;
        System.out.println("Lampara encendida");
    }

    public void apaga(){
        encendido = false;
        System.out.println("Lampara apagada");
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}
