public class Main {
    public static void main(String[] args) {
        int[] v = new int[10];

        for (int i = 0; i < 10; i++) {
            v[i] = (int)(Math.random() * 100);
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(i + "\t");
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.print(v[i] + "\t");
        }
        System.out.println();
    }
}