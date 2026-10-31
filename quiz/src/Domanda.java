public class Domanda {
    private String domanda;
    private Risposta[] risposte;
    private int valore;
    private int rispostaScelta;

    public Domanda(String domanda, Risposta[] risposte) {
        this.domanda = domanda;
        this.risposte = new Risposta[4];
        for (int i = 0; i < 4; i++) {
            this.risposte[i] = risposte[i];
        }
        this.valore = 1;
    }

    public Domanda(Domanda d) {
        this.domanda = d.domanda;
        this.valore = d.valore;
        this.risposte = new Risposta[4];
        for (int i = 0; i < 4; i++) {
            this.risposte[i] = d.risposte[i];
        }
    }

    public boolean rispondi(int valore){
    }
}
