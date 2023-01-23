package JavaAvanzado.Patrones.DeComportamiento.Iterator;

/*
Iterator - implementar una serie de métodos para recorrer datos sin saber como están almacenados
*/

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("David", 30));
        usuarios.crear(new Usuario("Pepe", 65));
        usuarios.crear(new Usuario("Eustaquio", 51));
        usuarios.crear(new Usuario("Maria", 41));

        while (usuarios.hayMas()){
            Usuario usuario = usuarios.siguiente();
            System.out.println("Usuario es: " + usuario.getNombre());
        }

        usuarios.crear(new Usuario("Paco", 45));
        Usuario usuario = usuarios.siguiente();
        System.out.println("Usuario es: " + usuario.getNombre());

        usuarios.reinicia();
        while (usuarios.hayMas()){
            usuario = usuarios.siguiente();
            System.out.println("Usuario es: " + usuario.getNombre());
        }
    }
}
