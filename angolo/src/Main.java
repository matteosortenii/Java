import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Main {

    public static Angolo creaAngolo(){
        Scanner input = new Scanner(System.in);
        System.out.println("inserire i gradi");
        int g = input.nextInt();
        System.out.println("inserire i primi");
        int p = input.nextInt();
        System.out.println("inserire i secondi");
        int s = input.nextInt();
        return new Angolo(g, p, s);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Angolo a1 = null;
        Angolo a2 = null;

        int scelta;

        do {
            System.out.println("1. Inserire il primo angolo");
            System.out.println("2. Inserire il secondo angolo");
            System.out.println("3. Sommare i due angoli");
            System.out.println("4. Sottrarre i due angoli");
            System.out.println("0. Uscire");

            scelta = input.nextInt();

            switch (scelta){
                case 1:
                    System.out.println("Inserire il primo angolo:");
                    a1 = creaAngolo();
                    break;

                case 2:
                    System.out.println("Inserire il secondo angolo:");
                    a2 = creaAngolo();
                    break;

                case 3:
                    if (a1 != null && a2 != null) {
                        Angolo somma = a1.sommaAngolo(a2);
                        System.out.println("Risultato della somma:");
                        System.out.println(somma.getGradi() + " gradi, "
                                + somma.getPrimi() + " primi, "
                                + somma.getSecondi() + " secondi");
                    } else {
                        System.out.println("Inserire prima entrambi gli angoli!");
                    }
                    break;

                case 4:
                    if (a1 != null && a2 != null) {
                        Angolo differenza = a1.sottraiAngolo(a2);
                        System.out.println("Risultato della sottrazione:");
                        System.out.println(differenza.getGradi() + " gradi, "
                                + differenza.getPrimi() + " primi, "
                                + differenza.getSecondi() + " secondi");
                    } else {
                        System.out.println("Inserire prima entrambi gli angoli!");
                    }
                    break;

                case 0:
                    System.out.println("Uscita dal programma.");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }

        } while (scelta != 0);
    }
}