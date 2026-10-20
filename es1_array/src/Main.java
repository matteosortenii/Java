import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] v = new int[10];
        System.out.print("Quanti valori vuoi inserire (massimo 10)? ");
        int n = scanner.nextInt();

        if (n > 10) n = 10;
        if (n < 0) n = 0;

        int[] pari = new int[n];
        int[] dispari = new int[n];
        int contaPari = 0;
        int contaDispari = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci il valore " + (i + 1) + ": ");
            v[i] = scanner.nextInt();
            if (v[i] % 2 == 0) {
                pari[contaPari++] = v[i];
            } else {
                dispari[contaDispari++] = v[i];
            }
        }

        System.out.print(contaPari + " ");
        for (int i = 0; i < contaPari; i++) {
            System.out.print(pari[i] + " ");
        }
        System.out.println();

        System.out.print(contaDispari + " ");
        for (int i = 0; i < contaDispari; i++) {
            System.out.print(dispari[i] + " ");
        }
        System.out.println();
    }
}