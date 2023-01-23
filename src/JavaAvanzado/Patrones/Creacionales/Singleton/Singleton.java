package JavaAvanzado.Patrones.Creacionales.Singleton;

public class Singleton {
    private static Singleton singleton;
    int contador;

    private Singleton() {} // al ser privado, no se podrán crear instancias desde otras clases

    // Si no se ha llamado previamente, singleton será null y por tanto crearemos y la devolveremos.
    // Si ya existe, devovemos el existente.
    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
}
