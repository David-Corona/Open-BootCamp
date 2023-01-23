package JavaAvanzado.Patrones.DeComportamiento.Observer;

import java.util.ArrayList;

public class Emisora {
    private ArrayList<Receptor> receptores = new ArrayList();

    public void meteReceptor(Receptor receptor){
        this.receptores.add(receptor);
    }

    // señal de notificacion, para notificar a todos los receptores
    public void emite() {
        for (Receptor receptor : receptores) {
            receptor.recibe();
        }
    }

}
