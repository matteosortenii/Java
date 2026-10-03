import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Punto puntoA = null;

        Punto puntoB = null;

        Rettangolo r = null;

        int scelta;

        do {
            System.out.println("1. costruisci rettangolo");
            System.out.println("2. calcola perimetro");
            System.out.println("3. calcola area");

            scelta = input.nextInt();
            System.out.println();

            switch (scelta){
                case 1:
                    System.out.print("Inserisci x del punto A: ");
                    double xA = input.nextDouble();

                    System.out.print("Inserisci y del punto A: ");
                    double yA = input.nextDouble();

                    System.out.print("Inserisci x del punto B: ");
                    double xB = input.nextDouble();

                    System.out.print("Inserisci y del punto B: ");
                    double yB = input.nextDouble();

                    r = new Rettangolo(puntoA, puntoB);
                    break;

                case 2:
                    System.out.println("il perimetro è: " + r.getPerimetro());
                    System.out.println();
                    break;

                case 3:
                    System.out.println("l'area è: " + r.getArea());
                    System.out.println();
                    break;
            }

        } while (scelta != 0);
    }
}