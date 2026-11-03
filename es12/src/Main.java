import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci email: ");
        String email = input.nextLine();

        int posizione = email.indexOf("@");
        String dominio = email.substring(posizione + 1);

        System.out.println("Dominio: " + dominio);
    }
}