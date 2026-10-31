package it.scuola.esercizi;
public class Main {
    public static void main(String[] args) {
        Rettangolo r = new Rettangolo(0, 4, 0, 3);

        System.out.println(r.getAltezza());
        System.out.println(r.getBase());
        System.out.println(r.getArea());
        System.out.println(r.getPerimetro());
    }
}