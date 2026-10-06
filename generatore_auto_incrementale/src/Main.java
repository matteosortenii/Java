import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il prefisso: ");
        String lettere = input.nextLine();

        System.out.print("Inserisci il numero di cifre: ");
        int n_cifre = input.nextInt();

        GeneratoreAutoIncrementale generatore =
                new GeneratoreAutoIncrementale(lettere, n_cifre);

        int scelta;

        do {
            System.out.println("1. Genera nuovo codice");
            System.out.println("2. Visualizza informazioni");
            System.out.println("0. Esci");

            scelta = input.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println("Nuovo codice: " + generatore.genera());
                    break;

                case 2:
                    System.out.println(generatore);
                    break;

                case 0:
                    System.out.println("Programma terminato.");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }

        } while (scelta != 0);

        input.close();
    }
}
