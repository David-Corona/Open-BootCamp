package JavaAvanzado.Patrones.DeComportamiento.State;

public class EstadoBloqueado extends Estado {

    public EstadoBloqueado(Telefono telefono) {
        super(telefono);
    }

    @Override
    public String desbloquear() {
        telefono.cambiaEstado(new EstadoDesbloqueado(telefono));
        return "desbloquear(): Móvil desbloqueado, procede.";
    }

    @Override
    public String abrirCamara() {
        return "abrirCamara(): La cámara está bloqueada. Desbloquea el móvil antes.";
    }

    @Override
    public String hacerFoto() {
        return "hacerFoto(): La cámara está bloqueada. Desbloquea el móvil antes.";
    }
}
