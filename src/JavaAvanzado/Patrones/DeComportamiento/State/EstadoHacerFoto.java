package JavaAvanzado.Patrones.DeComportamiento.State;

public class EstadoHacerFoto extends Estado {

    public EstadoHacerFoto(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        return "desbloquear(): Ya estaba desbloqueado.";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): La camara ya está abierta.";
    }

    @Override
    public String hacerFoto() {
        // telefono.cambiaEstado(new EstadoBloqueado(telefono));    // resetear al estado bloqueado
        return "hacerFoto(): La foto se ha hecho.";
    }
}
