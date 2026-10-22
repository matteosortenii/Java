import java.util.Random;

public class Dado {
    private int facce;
    private static Random rand = new Random();

    public Dado() {
        this.facce = 6;
    }

    public Dado(int n) {
        if (n < 2 || n == 3) {
            this.facce = 6;
        } else {
            this.facce = n;
        }
    }

    public Dado(Dado altro) {
        this.facce = altro.facce;
    }

    public int lancia() {
        return rand.nextInt(facce) + 1;
    }

    public int getFacce() {
        return facce;
    }

    @Override
    public String toString() {
        return "dado da " + facce;
    }
}