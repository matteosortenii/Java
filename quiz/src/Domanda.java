public class Domanda {
    private String testo;
    private Risposta[] risposte;
    private int valore;
    private int rispostaScelta;

    public Domanda(String testo, Risposta[] risposte) {
        this.testo = testo;
        this.risposte = risposte;
        this.valore = 1;
        this.rispostaScelta = 0;
    }

    public Domanda(Domanda d) {
        this.testo = d.testo;
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
        String s = this.testo + "\n";
        for (int i = 0; i < this.risposte.length; i++) {
            s +=(i + 1) + ") " + this.risposte[i].getTesto() + "\n";
        }
        return s;
    }
}
