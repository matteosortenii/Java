import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String nome;
        String cognome;
        int eta;
        float altezza;

        Scanner sc = new Scanner(System.in);
        nome = sc.nextLine();
        cognome = sc.nextLine();


        Studente s = new Studente("Matteo", "Sorteni", 17, (float)1.75);
    }
}