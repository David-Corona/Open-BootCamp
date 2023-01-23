package JavaAvanzado.Patrones.Estructurales.Decorator;

public class TelefonoBasico implements Telefono {
    @Override
    public void crear() {
        System.out.println("Soy un teléfono básico. Tengo estas características: ");
        tengoGSM();
        tengoSMS();
    }

    private void tengoGSM() {
        System.out.println("    -> Tengo GSM (básico)");
    }

    private void tengoSMS() {
        System.out.println("    -> Tengo SMS (básico)");
    }
}
