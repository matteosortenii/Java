import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci una data non valida (aaaa-mm-gg): ");
        String testo = input.nextLine();

        try {
            LocalDate data = LocalDate.parse(testo);
            System.out.println(data);
        } catch (Exception e) {
            System.out.println("Errore: data non valida");
        }
    }
}