package JavaAvanzado.Patrones.DeComportamiento.Mediator;

public class ColegaConcreto2 extends Colega {

    @Override
    public void recibe() {
        System.out.println("He recibido un mensaje, soy ColegaConcreto2");
    }

    @Override
    public void envia() {
        System.out.println("Soy ColegaConcreto2, envio un mensaje");
        mediator.reenvia(this);     // this es esta instancia (ColegaConcreto2)
    }
}
