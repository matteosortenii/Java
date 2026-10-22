import java.time.Duration;

public class Playlist {
    private String nome;
    private Canzone[] canzoni;
    private int numeroBrani;
    private String stato;
    private int branoCorrente;

    public Playlist(String nome) {
        this.nome = nome;
        this.canzoni = new Canzone[100];
        this.numeroBrani = 0;
        this.stato = "STOP";
        this.branoCorrente = 1;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantiBrani() {
        return numeroBrani;
    }

    public Canzone getCanzone(int n) {
        if (n >= 1 && n <= numeroBrani) {
            return canzoni[n - 1];
        }
        return null;
    }

    public boolean add(Canzone c) {
        if (numeroBrani < 100) {
            canzoni[numeroBrani] = c;
            numeroBrani++;
            return true;
        }
        return false;
    }

    public Duration durataTotale() {
        Duration totale = Duration.ZERO;
        for (int i = 0; i < numeroBrani; i++) {
            totale = totale.plus(canzoni[i].getDurata());
        }
        return totale;
    }

    public void play() {
        if (numeroBrani > 0) {
            this.stato = "PLAY";
        }
    }

    public void pause() {
        if (this.stato.equals("PLAY")) {
            this.stato = "PAUSE";
        }
    }

    public void stop() {
        if (this.stato.equals("STOP")) {
            this.branoCorrente = 1;
        } else {
            this.stato = "STOP";
        }
    }

    public void branoSuccessivo() {
        if (numeroBrani > 0) {
            branoCorrente++;
            if (branoCorrente > numeroBrani) {
                branoCorrente = 1;
            }
        }
    }

    public void branoPrecedente() {
        if (numeroBrani > 0) {
            branoCorrente--;
            if (branoCorrente < 1) {
                branoCorrente = numeroBrani;
            }
        }
    }

    @Override
    public String toString() {
        String infoBrano;
        if (numeroBrani > 0) {
            infoBrano = canzoni[branoCorrente - 1].getTitolo() + " di " + canzoni[branoCorrente - 1].getArtista();
        } else {
            infoBrano = "nessun brano";
        }
        return nome + ", " + numeroBrani + " brani, in " + stato + " sul brano " + infoBrano;
    }
}