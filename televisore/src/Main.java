import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Televisore t = new Televisore();

        Scanner s = new Scanner(System.in);

        int scelta;

        do {
            System.out.println("1. visualizzare il volume attuale");
            System.out.println("2. visualizzare il canale attuale");
            System.out.println("3. impostare il volume");
            System.out.println("4. canale successivo");
            System.out.println("5. canale precedente");
            System.out.println("6. selezionare canale");
            System.out.println("7. visualizzare le info del televisore");

            scelta = s.nextInt();

            switch (scelta){
                case 1:
                    System.out.println("il volume attuale è " + t.getVolume());
                    break;

                case 2:
                    System.out.println("il canale attuale è " + t.getCanale());
                    break;

                case 3:
                    int volume;
                    volume = s.nextInt();
                    t.setVolume(volume);
                    break;

                case 4:
                    t.canaleSuccessivo();
                    break;

                case 5:
                    t.canalePrecedente();
                    break;

                case 6:
            }
            
        } while (scelta != 0);
    }
}