import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        tazzaPerDadi tazza = null;
        int scelta;

        do {
            System.out.println("1. Crea nuova tazza (specificando capienza massima)");
            System.out.println("2. Crea nuova tazza con N dadi tutti uguali (N e facce)");
            System.out.println("3. Aggiungi un dado alla tazza");
            System.out.println("4. Mostra informazioni tazza (toString)");
            System.out.println("5. Lancia tutti i dadi");
            System.out.println("6. Mostra valore minimo e massimo ottenibile");
            System.out.println("7. Verifica stato (quanti dadi, capienza, se è vuota)");
            System.out.println("0. Esci");

            scelta = scanner.nextInt();

            switch (scelta) {
                case 1:
                    System.out.print("Inserisci la capienza massima della tazza: ");
                    int cap = scanner.nextInt();
                    tazza = new tazzaPerDadi(cap);
                    break;

                case 2:
                    System.out.print("Inserisci il numero di dadi (N): ");
                    int n = scanner.nextInt();
                    System.out.print("Inserisci il numero di facce per ogni dado (F): ");
                    int f = scanner.nextInt();
                    tazza = new tazzaPerDadi(n, f);
                    break;

                case 3:
                    System.out.print("Inserisci il numero di facce del dado da aggiungere: ");
                    int facceDado = scanner.nextInt();
                    Dado nuovoDado = new Dado(facceDado);
                    boolean aggiunto = tazza.add(nuovoDado);
                    if (aggiunto) {
                        System.out.println("Dado aggiunto con successo.");
                    } else {
                        System.out.println("la tazza è piena!");
                    }
                    break;

                case 4:
                    System.out.println("\n" + tazza);
                    break;

                case 5:
                    if (tazza.isEmpty()) {
                        System.out.println("La tazza è vuota");
                    } else {
                        System.out.println("Risultato del lancio: " + tazza.lancia());
                    }
                    break;

                case 6:
                    System.out.println("Valore minimo possibile: " + tazza.getMinimo());
                    System.out.println("Valore massimo possibile: " + tazza.getMassimo());
                    break;

                case 7:
                    System.out.println("Capienza massima: " + tazza.size());
                    System.out.println("Dadi attualmente contenuti: " + tazza.quanti());
                    System.out.println("La tazza è vuota? " + tazza.isEmpty());
                    break;

                case 0:
                    System.out.println("Programma terminato");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }
        } while (scelta != 0);
    }
}