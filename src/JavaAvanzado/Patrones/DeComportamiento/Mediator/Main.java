package JavaAvanzado.Patrones.DeComportamiento.Mediator;

/*
Mediator - actua de mediador/comunicador entre clases
(A le dice X al mediador, y mediador se lo dice a B; mismo con respuesta)
Útil cuando hay muchas clases que deben comunicarse entre ellas
*/

public class Main {
    public static void main(String[] args) {
        Mediator mediador = new MediadorConcreto();

        Colega colega1 = new ColegaConcreto1();
        Colega colega2 = new ColegaConcreto2();
        Colega colega3 = new ColegaConcreto3();


        mediador.registra(colega1);
        mediador.registra(colega2);
        mediador.registra(colega3);

        colega1.envia();
        colega2.envia();
    }
}
