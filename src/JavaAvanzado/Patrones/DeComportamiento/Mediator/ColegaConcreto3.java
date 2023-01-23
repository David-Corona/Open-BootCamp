package JavaAvanzado.Patrones.DeComportamiento.Mediator;

public class ColegaConcreto3 extends Colega {

    @Override
    public void recibe() {
        System.out.println("He recibido un mensaje, soy ColegaConcreto3");
    }

    @Override
    public void envia() {
        System.out.println("Soy ColegaConcreto3, envio un mensaje");
        mediator.reenvia(this);     // this es esta instancia (ColegaConcreto3)
    }
}
