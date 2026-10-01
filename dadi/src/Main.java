import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Dado dado = new Dado();

        int scelta;

        do {
            System.out.println("1. Visualizza dado");
            System.out.println("2. Lancia dado");
            System.out.println("3. Crea dado con N facce");
            System.out.println("4. Crea copia del dado");
            System.out.println("0. Esci");

            System.out.print("Scelta: ");
            scelta = input.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println(dado);
                    break;

                case 2:
                    System.out.println("Risultato del lancio: " + dado.lancia());
                    break;

                case 3:
                    System.out.print("Inserisci il numero di facce: ");
                    int n = input.nextInt();
                    dado = new Dado(n);
                    System.out.println("Dado creato: " + dado);
                    break;

                case 4:
                    dado = new Dado(dado);
                    System.out.println("Copia creata: " + dado);
                    break;

                case 0:
                    System.out.println("Arrivederci!");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }

        } while (scelta != 0);

        input.close();
    }
}
