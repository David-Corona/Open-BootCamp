package JavaAvanzado.Patrones.DeComportamiento.Observer;

/*
Observer/public subscriber (pubsub) - Uno habla y muchos escuchan (one to many)
Cuando se produce un evento, los suscriptores al evento reaccionan ante lo que ocurre
*/

public class Main {
    public static void main(String[] args) {
        Emisora emisora = new Emisora();

        ReceptorTV tv = new ReceptorTV();
        ReceptorRadio radio = new ReceptorRadio();

        emisora.meteReceptor(tv);
        emisora.meteReceptor(radio);

        emisora.emite();
    }
}
