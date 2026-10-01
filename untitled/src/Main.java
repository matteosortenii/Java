import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ContoCorrente contoCorrente = new ContoCorrente("Matteo", "Sorteni", "abc123");

        int scelta;

        do {
            System.out.println("1. Visualizza saldo");
            System.out.println("2. Deposita");
            System.out.println("3. Preleva");
            System.out.println("4. Visualizza codice");
            System.out.println("5. Visualizza nominativo");
            System.out.println("6. Visualizza informazioni conto");
            System.out.println("0. Esci");

            System.out.print("inseire la scelta: ");
            scelta = input.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Saldo: " + contoCorrente.getSaldo());
                    break;

                case 2:
                    System.out.print("Quanto vuoi depositare? ");
                    double deposito = input.nextDouble();
                    System.out.println("Saldo dopo il deposito: " + contoCorrente.deposita(deposito));
                    break;

                case 3:
                    System.out.print("Quanto vuoi prelevare? ");
                    double prelievo = input.nextDouble();
                    System.out.println("Saldo dopo il prelievo: " + contoCorrente.preleva(prelievo));
                    break;

                case 4:
                    System.out.println("Codice: " + contoCorrente.getCodice());
                    break;

                case 5:
                    System.out.println("Nominativo: " + contoCorrente.getNominativo());
                    break;

                case 6:
                    System.out.println(contoCorrente);
                    break;

                case 0:
                    System.out.println("Programma terminato");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }

        } while (scelta != 0);

        input.close();
    }
}