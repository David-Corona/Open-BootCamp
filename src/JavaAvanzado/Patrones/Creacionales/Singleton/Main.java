package JavaAvanzado.Patrones.Creacionales.Singleton;

/*
Singleton: 1 clase => 1 única instancia
Crea una primera instancia. Pero al intentar crear una segunda, opera con la misma en vez de crear una nueva.
Ejemplo util: no tener varias conexiones a la BBDD, usar siempre la misma instancia/conexión
 */

public class Main {
    public static void main(String[] args) {

        // Ejemplo 1
        Singleton singleton = Singleton.getInstance();
        singleton.setContador(15);
        System.out.println("Valor: " + singleton.getContador() + " en memoria: " + singleton);

        Singleton singleton2 = Singleton.getInstance();
        singleton2.setContador(10);
        System.out.println("Valor: " + singleton2.getContador() + " en memoria: " + singleton2);

        // Ejemplo 2
        Aplicacion app = Aplicacion.getInstance();
        Aplicacion app2 = Aplicacion.getInstance();
        app.Run();
        app2.Run();
        System.out.println(app + " " + app2);
    }
}
