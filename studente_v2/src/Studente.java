public class Studente {
    private String nome;
    private String cognome;
    private int eta;
    private double altezza;
    private double peso;

    public Studente() {
        this.nome = " ";
        this.cognome = " ";
        this.eta = 0;
        this.altezza = 0.0;
        this.peso = 0.0;
    }

    public Studente(String nome, String cognome, int eta, double altezza, double peso) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.altezza = altezza;
        this.peso = peso;

        if (this.eta <= 5) {
            this.eta = 5;
        }

        if (this.altezza < 0.8) {
            this.altezza = 0.8;
        }

        if (this.peso < 20) {
            this.peso = 20;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public double getAltezza() {
        return altezza;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String calcolaIndice() {
        double BMI = peso / (altezza * altezza);

        if (BMI < 18.5) {
            return "sottopeso";
        } else if (BMI >= 18.5 && BMI <= 24.9) {
            return "normopeso";
        } else if (BMI >= 25 && BMI <= 29.9) {
            return "sovrappeso";
        } else {
            return "obeso";
        }
    }

    @Override
    public String toString() {
        String s = "i dati dello studente sono: ";
        s += this.nome + ", " + this.cognome + ", " + this.eta + ", " + this.altezza + ", " + this.peso;
        return s;
    }

    public double mediaEta(Studente s2) {
        return (this.eta + s2.eta) / 2.0;
    }

    public String confrontaAltezze(Studente s2) {
        if (this.altezza > s2.altezza) {
            return "è più alto lo studente 1";
        } else if (this.altezza < s2.altezza) {
            return "è più alto lo studente 2";
        } else {
            return "i due studenti hanno la stessa altezza";
        }
    }
}
