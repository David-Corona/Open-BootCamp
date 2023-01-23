package JavaAvanzado.Patrones.Estructurales.Facade;

/*
Facade/Fachada - envoltorio que simplifica algo que hay complejo por detrás
En este ejemplo, se "esconde" la complejidad en VideoConversionFacade
*/

public class Main {
    public static void main(String[] args) {
        VideoConversionFacade conversor = new VideoConversionFacade();
        conversor.convertVideo("fichero.org", "mp4");
    }
}
