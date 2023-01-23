package JavaAvanzado.Patrones.Creacionales.Factory;

public class PrecioFactory {
    Precio precio;

    private PrecioFactory() {} // ocultamos el constructor

    public PrecioFactory(String pais) {
        if(pais.equalsIgnoreCase("España")){
            System.out.println("En España, precio en EUR");
            precio = new PrecioEUR();
        } else if(pais.equalsIgnoreCase("UK")) {
            System.out.println("En UK, precio en GBP");
            precio = new PrecioGBP();
        } else {
            System.out.println("Otro país, precio en USD");
            precio = new PrecioUSD();
        }
    }

    public double getPrecio() {
        return precio.getPrecio();
    }
}
