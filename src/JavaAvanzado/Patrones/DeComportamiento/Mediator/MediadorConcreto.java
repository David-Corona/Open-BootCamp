package JavaAvanzado.Patrones.DeComportamiento.Mediator;

import java.util.ArrayList;

public class MediadorConcreto extends Mediator {
    ArrayList<Colega> colegas = new ArrayList();

    @Override
    public void registra(Colega colega){
        if(!colegas.contains(colega)){      // no volver a añadir al mismo
            colegas.add(colega);
            colega.setMediator(this);       // indica cual será su mediador, la instancia actual del mediador concreto
        }
    }

    @Override
    public void reenvia(Colega colega){
        for (Colega actual : colegas){
            if(!actual.equals(colega)){     // evitar enviar a si mismo
                actual.recibe();
            }
        }
    }
}
