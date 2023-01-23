package JavaAvanzado.Patrones.DeComportamiento.Strategy;

/*
Strategy - para crear un envoltorio sobre varias funciones, de forma que un mismo código se pueda usar de forma diferente
Plataforma de pago, distintas opciones de pago: metodo pagar en clases diferentes, se ejecutará una u otra
*/

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int tipo = 0;
        Usuarios usuarios;

        if (tipo == 0) {
            usuarios = new UsuariosMemoria();
        } else {
            usuarios = new UsuariosFichero();
        }

        crear(usuarios, "David");
        crear(usuarios, "Pepe");
        crear(usuarios, "Maria");

        for (String usuario: listar(usuarios)) {
            System.out.println(usuario);
        }
    }

    // Finalmente creamos el envoltorio
    public static void crear(Usuarios usuarios, String nombre) {
        usuarios.crear(nombre);
    }

    public static ArrayList<String> listar(Usuarios usuarios) {
        return usuarios.listar();
    }
}
