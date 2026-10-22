import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] v = new int[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Inserisci un numero intero: ");
            int val = scanner.nextInt();
            if (val < 0) {
                break;
            }
            v[count++] = val;
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
}