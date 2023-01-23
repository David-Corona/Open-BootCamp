package JavaAvanzado.Patrones.DeComportamiento.State;

public class EstadoCamaraAbierta extends Estado {

    public EstadoCamaraAbierta(Telefono telefono) {
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
        telefono.cambiaEstado(new EstadoHacerFoto(telefono));
        return "hacerFoto(): La foto se va a producir ahora.";
    }
}
