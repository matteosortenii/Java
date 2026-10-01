public class Main {
    public static void main(String[] args) {

        ContoCorrente contoCorrente = new ContoCorrente("Matteo", "Sorteni", "abc123");

        System.out.println(contoCorrente.getSaldo());
        System.out.println(contoCorrente.getCodice());
        System.out.println(contoCorrente.getNominativo());

        System.out.println("Deposito: " + contoCorrente.deposita(100));
        System.out.println("Deposito: " + contoCorrente.deposita(50.50));

        System.out.println("Prelievo: " + contoCorrente.preleva(30));
        System.out.println("Prelievo: " + contoCorrente.preleva(200));

        System.out.println(contoCorrente.getSaldo());

        System.out.println(contoCorrente);
    }
}
