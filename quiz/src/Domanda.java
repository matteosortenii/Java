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
        this.risposte = new Risposta[d.risposte.length];
        for (int i = 0; i < d.risposte.length; i++) {
            this.risposte[i] = d.risposte[i];
        }
    }


    public boolean rispondi ( int valore){
        this.rispostaScelta = valore;
        return this.risposte[valore - 1].isCorretta();
    }

    public int getValore () {
        return valore;
    }

    public void setValore (int valore){
        if (valore >= 0){
            this.valore = valore;
        }
    }

    public int getPunteggio(){
        if(rispostaScelta == 0){
            return -1;
        }
        if (risposte[rispostaScelta - 1].isCorretta()){
            return valore;
        } else return 0;
    }

    public boolean completata(){
        return rispostaScelta != 0;
    }

    public String getRispostaCorretta(){
        for (int i = 0; i < risposte.length; i++) {
            if(risposte[i].isCorretta()){
                return risposte[i].getTesto();
                }
        }
        return null;
    }

    public String getRispostaData(){
        if(rispostaScelta == 0){
            return null;
        } return risposte[rispostaScelta - 1].getTesto();
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