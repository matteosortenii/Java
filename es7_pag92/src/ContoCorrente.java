public class ContoCorrente {
    private String nome;
    private String cognome;
    private String codice;
    private double saldo;

    public ContoCorrente(String nome, String cognome, String codice) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = codice;
        this.saldo = 0;
    }

    public double preleva(double importo) throws OperazioneNonValidaException {
        if (importo < 0) {
            throw new OperazioneNonValidaException("L'importo da prelevare non puo' essere negativo");
        }
        if (importo > saldo) {
            throw new OperazioneNonValidaException("Saldo insufficiente: il saldo e' " + saldo
                    + " e si vuole prelevare " + importo);
        }
        saldo = saldo - importo;
        return saldo;
    }

    public double deposita(double importo) throws OperazioneNonValidaException {
        if (importo < 0) {
            throw new OperazioneNonValidaException("L'importo da depositare non puo' essere negativo");
        }
        saldo = saldo + importo;
        return saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCodice() {
        return codice;
    }

    public String getNominativo() {
        return nome + " " + cognome;
    }

    public String toString() {
        return "Conto " + codice + " - Intestatario: " + getNominativo() + " - Saldo: " + saldo;
    }
}
