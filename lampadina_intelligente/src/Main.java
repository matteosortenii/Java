import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        lampadinaIntelligente l = new lampadinaIntelligente(15);
        int continua;
        do {
            System.out.println("\n1. Leggi il nome della lampadina \n2. Imposta il nome della lampadina \n3. Leggi il colore della lampadina \n4. Imposta il colore della lampadina \n5. Accendi la lampadina \n6. Spegni la lampadina \n7. Aumenta l'illuminazione della lampadina \n8. Diminuisci l'illuminazione della lampadina \n9. Leggi le informazioni della lampadina");

            int scelta;

            Scanner input = new Scanner(System.in);
            scelta = input.nextInt();

            switch (scelta) {
                case 1:
                    System.out.println(l.getNome());
                    break;
                case 2:
                    System.out.println("Digitare il nome da impostare: ");
                    input.nextLine();
                    String nome = input.nextLine();
                    l.setNome(nome);
                    break;
                case 3:
                    System.out.println(l.getColore());
                    break;
                case 4:
                    System.out.println("Digitare il colore da impostare: ");
                    input.nextLine();
                    String colore = input.nextLine();
                    l.setColore(colore);
                    break;
                case 5:
                    l.accendi();
                    break;
                case 6:
                    l.spegni();
                    break;
                case 7:
                    l.aumentaIlluminazione();
                    break;
                case 8:
                    l.diminuisciIlluminazione();
                    break;
                case 9:
                    System.out.println(l.toString());
                    break;
                default:
                    System.out.println("Scelta non valida.");
                    break;
            }

            System.out.println("Digitare 0 per continuare a interagire con la lampadina, qualsiasi altro numero per interrompere");
            continua = input.nextInt();

        } while (continua == 0);
        System.out.println("Hai interrotto il programma. Spegnimento");
    }
}