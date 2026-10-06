public class ContoCorrente {
    private String nome;
    private String cognome;
    private String codiceUnivoco;
    private double saldo;

    public ContoCorrente(String nome, String cognome, String codiceUnivoco){
        this.nome = nome;
        this.cognome = cognome;
        this.codiceUnivoco = codiceUnivoco;
        this.saldo = 0;
    }

    public double preleva(double quantita){
        if (quantita >= 0 && saldo - quantita >= 0){
            return saldo -= quantita;
        } else return saldo;
    }

    public double deposita(double quantita){
        if (quantita > 0) {
            return saldo += quantita;
        } else return saldo;
    }

    public String getSaldo(){
        return "il saldo è di " + saldo + " euro";
    }

    public String getCodice(){
        return "il codie univoco del conto corrente è " + codiceUnivoco;
    }

    public String getNominativo(){
        return "il propiretario del conto corrente è " + nome + " " + cognome;
    }

    @Override
    public String toString() {
        return "il conto corrente " + codiceUnivoco + " di " + nome + " " + cognome + " ha un saldo di " + saldo + " euro";
    }
}