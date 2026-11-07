package it.scuola.esercizi;

import java.time.Instant;

class Azione {
    private String azione;
    private int attenzione;
    private Instant i;

    public Azione(String azione, int attenzione) {
        this.azione = azione;
        if (attenzione < 1){
            attenzione = 1;
        }
        if (attenzione > 5){
            attenzione = 5;
        }
        this.attenzione = attenzione;
        i = Instant.now();
    }

    public String getAzione() {
        return azione;
    }

    public String getAttenzione() {
        if (attenzione == 1) return "nessun problema";
        if (attenzione == 2) return "annotazione";
        if (attenzione == 3) return "evento moderato";
        if (attenzione == 4) return "eventp grave";
        return "evento critico";
    }

    public Instant getI() {
        return i;
    }

    @Override
    public String toString() {
        return "Descrizione: " + azione + "\n" + i + "\n" + getAzione();
    }
}

public class Logger {
    private int maxAzioni;
    Azione[] azioni;
    int nAzioni;

}