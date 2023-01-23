package JavaAvanzado.Patrones.DeComportamiento.Iterator;

public interface UsuarioIterator {
    // hasMore(): ¿hay más usuarios en el iterador?
    boolean hayMas();

    // reset(): reinicia el contador/iterador
    void reinicia();

    // next(): obtiene el siguiente
    Usuario siguiente();
}
