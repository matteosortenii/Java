public class tazzaPerDadi {
    private Dado[] dadi;
    private int conteggio;

    public tazzaPerDadi(int capienzaMassima) {
        this.dadi = new Dado[capienzaMassima];
        this.conteggio = 0;
    }

    public tazzaPerDadi(int n, int f) {
        this.dadi = new Dado[n];
        this.conteggio = n;
        for (int i = 0; i < n; i++) {
            this.dadi[i] = new Dado(f);
        }
    }

    public boolean add(Dado d) {
        if (conteggio < dadi.length) {
            dadi[conteggio] = d;
            conteggio++;
            return true;
        }
        return false;
    }

    public int quanti() {
        return conteggio;
    }

    public int size() {
        return dadi.length;
    }

    public boolean isEmpty() {
        return conteggio == 0;
    }

    public int getMassimo() {
        int somma = 0;
        for (int i = 0; i < conteggio; i++) {
            somma += dadi[i].getFacce();
        }
        return somma;
    }

    public int getMinimo() {
        return conteggio;
    }

    public int lancia() {
        int somma = 0;
        for (int i = 0; i < conteggio; i++) {
            somma += dadi[i].lancia();
        }
        return somma;
    }

    @Override
    public String toString() {
        boolean tuttiUguali = true;
        if (conteggio > 0) {
            int primeFacce = dadi[0].getFacce();
            for (int i = 1; i < conteggio; i++) {
                if (dadi[i].getFacce() != primeFacce) {
                    tuttiUguali = false;
                    break;
                }
            }
        } else {
            tuttiUguali = false;
        }

        if (tuttiUguali && conteggio == dadi.length && conteggio > 0) {
            return "Questa tazza contiene esattamente " + conteggio + " dadi, tutti con " + dadi[0].getFacce() + " facce";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Questa tazza può contenere al massimo ").append(dadi.length).append(" dadi.\n");
            sb.append("Dadi attualmente contenuti: ").append(conteggio).append("\n");
            sb.append("Lista dei dadi:");
            for (int i = 0; i < conteggio; i++) {
                sb.append("\n- ").append(dadi[i].toString());
            }
            return sb.toString();
        }
    }
}