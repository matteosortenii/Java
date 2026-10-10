import javax.swing.plaf.PanelUI;
import java.util.Scanner;

public class Main {

    public static Angolo creaAngolo(){
        Angolo a = null;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("inserire i gradi");
        n = input.nextInt();
        a.setGradi(n);
        System.out.println("inserire i primi");
        n = input.nextInt();
        a.setPrimi(n);
        System.out.println("inserire i secondi");
        n = input.nextInt();
        a.setSecondi(n);
        return a;
    }

    public static void main(String[] args) {

    }
}