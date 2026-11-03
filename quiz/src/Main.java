import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Domanda d;
        Risposta[] risposte = new Risposta[4];
        risposte[0] = new Risposta("Roma", true);
        risposte[1] = new Risposta("Parigi", false);
        risposte[2] = new Risposta("Madrid", false);
        risposte[3] = new Risposta("Brescia", false);
        d = new Domanda("Qual è la capitale dell' Italia: ",risposte );
        System.out.println(d);

        Scanner in = new Scanner(System.in);
        System.out.println("Qual è la risposta corretta? ");
        int r = in.nextInt();
        if (d.rispondi(r)){
            System.out.println("Risposta corretta");
        }
        else{
            System.out.println("Risposta errata");
        }
    }
}