import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci giorno: ");
        int giorno = input.nextInt();

        System.out.print("Inserisci mese: ");
        int mese = input.nextInt();

        System.out.print("Inserisci anno: ");
        int anno = input.nextInt();

        LocalDate data = LocalDate.of(anno, mese, giorno);

        System.out.println("Data: " + data);
        System.out.println("Tra un giorno: " + data.plusDays(1));
        System.out.println("Tra un mese: " + data.plusMonths(1));
        System.out.println("Tra un anno: " + data.plusYears(1));
    }
}