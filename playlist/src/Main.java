import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il nome della playlist: ");
        String nome = input.nextLine();

        System.out.print("Inserisci il numero di brani: ");
        int n_brani = input.nextInt();

        Playlist playlist = new Playlist(nome, n_brani);

        int scelta;

        do {
            System.out.println("1. Play");
            System.out.println("2. Pause");
            System.out.println("3. Stop");
            System.out.println("4. Brano successivo");
            System.out.println("5. Brano precedente");
            System.out.println("6. Visualizza playlist");
            System.out.println("0. Esci");

            scelta = input.nextInt();

            switch (scelta) {
                case 1:
                    playlist.play();
                    break;

                case 2:
                    playlist.pause();
                    break;

                case 3:
                    playlist.stop();
                    break;

                case 4:
                    playlist.branoSuccessivo();
                    break;

                case 5:
                    playlist.branoPrecedente();
                    break;

                case 6:
                    System.out.println(playlist);
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