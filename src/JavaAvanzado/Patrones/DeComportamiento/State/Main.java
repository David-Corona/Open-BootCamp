package JavaAvanzado.Patrones.DeComportamiento.State;

/*
State/de estado - para crear workflows (sucesión de eventos)
Ejemplo: si no pasa una cosa, no puede pasar otra
En este ejemplo, no se puede hacer una foto sin desbloquear el móvil y abrir la camara
*/

public class Main {
    public static void main(String[] args) {
        Telefono tel1 = new Telefono();

        System.out.println(tel1.estado.desbloquear());
        System.out.println(tel1.estado.abrirCamara());
        System.out.println(tel1.estado.hacerFoto());
        System.out.println(tel1.estado.hacerFoto());
    }
}
