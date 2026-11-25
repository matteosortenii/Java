public class TestContoCorrente {

    public static void main(String[] args) {

        ContoCorrente conto = new ContoCorrente("Mario", "Rossi", "IT001");

        System.out.println("Codice: " + conto.getCodice());
        System.out.println("Nominativo: " + conto.getNominativo());
        System.out.println("Saldo iniziale: " + conto.getSaldo());

        try {
            double nuovoSaldo = conto.deposita(500);
            System.out.println("Deposito di 500 riuscito. Saldo: " + nuovoSaldo);
        } catch (OperazioneNonValidaException e) {
            System.out.println("Errore: " + e.getMotivo());
        }

        // Prelievo valido
        try {
            double nuovoSaldo = conto.preleva(200);
            System.out.println("Prelievo di 200 riuscito. Saldo: " + nuovoSaldo);
        } catch (OperazioneNonValidaException e) {
            System.out.println("Errore: " + e.getMotivo());
        }

        // Deposito NON valido (importo negativo)
        try {
            conto.deposita(-50);
            System.out.println("Deposito di -50 riuscito");
        } catch (OperazioneNonValidaException e) {
            System.out.println("Errore nel deposito: " + e.getMotivo());
        }

        // Prelievo NON valido (importo negativo)
        try {
            conto.preleva(-10);
            System.out.println("Prelievo di -10 riuscito");
        } catch (OperazioneNonValidaException e) {
            System.out.println("Errore nel prelievo: " + e.getMotivo());
        }

        // Prelievo NON valido (saldo insufficiente)
        try {
            conto.preleva(1000);
            System.out.println("Prelievo di 1000 riuscito");
        } catch (OperazioneNonValidaException e) {
            System.out.println("Errore nel prelievo: " + e.getMotivo());
        }

        // toString
        System.out.println(conto.toString());
    }
}
