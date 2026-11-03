import java.util.Scanner;

public class Main {
    public static Punto creaPunto(){
        Scanner s = new Scanner(System.in);

        System.out.println("inserire la coordinara x del punto");
        double x = s.nextDouble();
        System.out.println("inserire la coordinara y del punto");
        double y = s.nextDouble();

        return new Punto(x, y);
    }

    public static Vettore creaVettore(){
        System.out.println("crea l'origine del vettore");
        Punto origine = creaPunto();
        System.out.println("crea il vertice del vettore");
        Punto vertice = creaPunto();
        return new Vettore(origine, vertice);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Vettore v1 = null;
        Vettore v2 = null;
        int scelta;

        do {
            System.out.println("1. crea i vettori");
            System.out.println("2. visualizza le coordinate dei vettori creati");
            System.out.println("3. calcola la lunghezza dei vettori");
            System.out.println("4. spostare l'origine di un vettore");
            System.out.println("5. verificare se i vettori hanno la stessa origine");
            System.out.println("0. uscire dal programma");

            scelta = s.nextInt();

            switch (scelta){
                case 1:
                    v1 = creaVettore();
                    v2 = creaVettore();
                    break;

                case 2:
                    System.out.println("vettore 1: " + v1.toString());
                    System.out.println("vettore 2: " + v2.toString());
                    break;

                case 3:
                    System.out.println("la lunghezza del primo vettore è: " + v1.calcolaLunghezza());
                    System.out.println("la lunghezza del primo vettore è: " + v2.calcolaLunghezza());
                    break;

                case 4:
                    System.out.println("di quale vettore vuoi modificare l'origine?");
                    int quale;
                    Scanner input = new Scanner(System.in);
                    quale = input.nextInt();

                    System.out.println("inserisci le coordinate della nuova origine");
                    Punto nuovoPunto = creaPunto();

                    if (quale == 1){
                        v1.spostaOrigine(nuovoPunto);
                    } else if (quale == 2){
                        v2.spostaOrigine(nuovoPunto);
                    } else {
                        System.out.println("scelta non valida");
                    }
                    break;

                case 5:
                    if (v1.verificaOrigine(v2.getOrigine())){
                    System.out.println("i 2 vettori hanno la stessa origine");
                } else {
                    System.out.println("i vettori non hanno la stessa origine");
                }
                break;

                case 0:
                    System.out.println("programma terminato");
                    break;
            }
        } while (scelta != 0);
    }
}