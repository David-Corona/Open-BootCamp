package JavaAvanzado.Patrones.DeComportamiento.Mediator;

public class ColegaConcreto1 extends Colega {

    @Override
    public void recibe() {
        System.out.println("He recibido un mensaje, soy ColegaConcreto1");
    }

    @Override
    public void envia() {
        System.out.println("Soy ColegaConcreto1, envio un mensaje");
        mediator.reenvia(this);     // this es esta instancia (ColegaConcreto1)
    }
}
