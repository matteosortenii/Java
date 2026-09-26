public class Studente {
    private String nome;
    private String cognome;
    int eta;
    double altezza;
    double peso;

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

    public String calcolaIndice(){
        double BMI = peso / (altezza * altezza);
        if (BMI < 18.5){
            return "sottopeso";
        } else if (BMI >= 18.5 && BMI <= 24.9){
            return "normopeso";
        } else if (BMI >= 25 && BMI <= 29.9){
            return "sovrappeso";
        } else return "obeso";
    }

    //override
    public String toString(){
        String s = "i dati dello studente sono: ";
        s += this.nome + ", " + this.cognome +", " + this.eta + ", " + this.altezza;
        return s;
    }
}
