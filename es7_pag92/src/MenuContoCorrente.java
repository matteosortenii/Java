import java.util.Scanner;

public class MenuContoCorrente {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = in.nextLine();
        System.out.print("Cognome: ");
        String cognome = in.nextLine();
        System.out.print("Codice del conto: ");
        String codice = in.nextLine();

        ContoCorrente conto = new ContoCorrente(nome, cognome, codice);

        int scelta = -1;

        while (scelta != 0) {
            System.out.println();
            System.out.println("1 - Preleva");
            System.out.println("2 - Deposita");
            System.out.println("3 - Mostra saldo");
            System.out.println("4 - Mostra codice");
            System.out.println("5 - Mostra nominativo");
            System.out.println("6 - Mostra informazioni conto");
            System.out.println("0 - Esci");
            System.out.print("Scelta: ");

            try {
                scelta = in.nextInt();

                if (scelta == 1) {
                    System.out.print("Importo da prelevare: ");
                    double importo = Double.parseDouble(in.nextLine());
                    double saldo = conto.preleva(importo);
                    System.out.println("Prelievo eseguito. Nuovo saldo: " + saldo);

                } else if (scelta == 2) {
                    System.out.print("Importo da depositare: ");
                    double importo = Double.parseDouble(in.nextLine());
                    double saldo = conto.deposita(importo);
                    System.out.println("Deposito eseguito. Nuovo saldo: " + saldo);

                } else if (scelta == 3) {
                    System.out.println("Saldo: " + conto.getSaldo());

                } else if (scelta == 4) {
                    System.out.println("Codice: " + conto.getCodice());

                } else if (scelta == 5) {
                    System.out.println("Nominativo: " + conto.getNominativo());

                } else if (scelta == 6) {
                    System.out.println(conto.toString());

                } else if (scelta == 0) {
                    System.out.println("Arrivederci!");

                } else {
                    System.out.println("Scelta non valida");
                }

            } catch (OperazioneNonValidaException e) {
                System.out.println("Operazione non valida: " + e.getMotivo());
            } catch (NumberFormatException e) {
                System.out.println("Devi inserire un numero!");
            }
        }

        in.close();
    }
}
