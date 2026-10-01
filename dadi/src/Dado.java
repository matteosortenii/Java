import java.util.Random;

public class Dado {
    private int facce;

    public Dado() {
        facce = 6;
    }

    public Dado(Dado d2){
        this.facce = d2.facce;
    }

    public Dado(int n){
        if (n <= 3){
            facce = 6;
        } else facce = n;
    }

    public int lancia(){
        Random random = new Random();
        return random.nextInt(facce) + 1;
    }

    public String toString(){
        return "dado a " + facce + " facce";
    }
}
