import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Studente studente1 = null;
        Studente studente2 = null;

        int scelta = 0;

        while (scelta !=4){
            System.out.println("digitare 1 per inserie i dati dei 2 studenti");
            System.out.println("digitare 2 per calcolare la massa corporea dei 2 studenti");
            System.out.println("digitare 3 per stampare i dati dei 2 studenti");
            System.out.println("digitare 4 per uscire");

            scelta = input.nextInt();

            switch (scelta){
                case 1:
                    System.out.println("inserire nome, cognome, eta, altezza e peso dello studente 1");
                    String nome1 = input.next();
                    String cognome1 = input.next();
                    int eta1 = input.nextInt();
                    double altezza1 = input.nextDouble();
                    double peso1 = input.nextDouble();

                    studente1 = new Studente(nome1, cognome1, eta1, altezza1, peso1);

                    System.out.println("Inserire nome, cognome, eta, altezza e peso dello studente 2");

                    String nome2 = input.next();
                    String cognome2 = input.next();
                    int eta2 = input.nextInt();
                    double altezza2 = input.nextDouble();
                    double peso2 = input.nextDouble();

                    studente2 = new Studente(nome2, cognome2, eta2, altezza2, peso2);

                    break;
            }
        }
    }
}