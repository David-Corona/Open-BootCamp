package JavaAvanzado.Patrones.Estructurales.Decorator;

/*
Decorator - añadir funcionalidad a una clase existente sin cambiar su código
Mejorar una clase sin tocar la original => envolviendo las clases, una dentro de otra
*/

public class Main {
    public static void main(String[] args) {
        TelefonoBasico telefonoBasico = new TelefonoBasico();
        telefonoBasico.crear();

        TelefonoInteligente ti = new TelefonoInteligente(new TelefonoBasico());
        ti.crear();

        TelefonoNextGen tng = new TelefonoNextGen(new TelefonoInteligente(new TelefonoBasico()));
        tng.crear();
    }
}
