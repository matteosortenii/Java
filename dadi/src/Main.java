public class Main {
    public static void main(String[] args) {

        Dado d1 = new Dado();
        System.out.println(d1);

        Dado d2 = new Dado(10);
        System.out.println(d2);

        Dado d3 = new Dado(d2);
        System.out.println(d3);

        System.out.println("Lancio d1: " + d1.lancia());
        System.out.println("Lancio d2: " + d2.lancia());
        System.out.println("Lancio d3: " + d3.lancia());

        System.out.println("d1: " + d1.toString());
        System.out.println("d2: " + d2.toString());
        System.out.println("d3: " + d3.toString());
    }
}
