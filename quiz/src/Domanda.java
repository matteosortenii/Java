public class Domanda {
    private String domanda;
    private Risposta[] risposte;
    private int valore;
    private int rispostaScelta;

    public Domanda(String domanda, Risposta[] risposte) {
        this.domanda = domanda;
        this.risposte = risposte;
        this.valore = 1;
        this.rispostaScelta = 0;
    }

    public Domanda(Domanda d) {
        this.domanda = d.domanda;
        this.valore = d.valore;
        this.rispostaScelta = 0;
        this.risposte = d.risposte;
    }

    public boolean rispondi(int valore){
        this.rispostaScelta = valore;
        return this.risposte[ valore-1].isCorretta();
    }

    @Override
    public String toString(){
        String s = this.domanda + "\n";
        for (int i = 0; i < this.risposte.length; i++) {
            s +=(i + 1) + ") " + this.risposte[i].getDomanda() + "\n";
        }
        return s;
    }
}
