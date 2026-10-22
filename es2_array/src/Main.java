import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] v = new int[10];
        System.out.print("Inserisci il valore a: ");
        int a = scanner.nextInt();
        System.out.print("Inserisci il valore b: ");
        int b = scanner.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        int m = (a + b) / 2;

        for (int i = 0; i < v.length; i++) {
            v[i] = a + (int)(Math.random() * (b - a + 1));
        }

        for (int i = 0; i < v.length; i++) {
            if (v[i] >= a && v[i] <= m) {
                System.out.print(v[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < v.length; i++) {
            if (v[i] >= m + 1 && v[i] <= b) {
                System.out.print(v[i] + " ");
            }
        }
        System.out.println();
    }
}