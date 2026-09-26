public class Studente {
    private String nome;
    private String cognome;
    int eta;
    double altezza;
    double peso;

    public Studente(String name, String surname, int age, double height, double wheight){
        this.nome = " ";
        this.cognome = " ";
        if (this.eta <= 5) {
            eta = 5;
        } else this.eta = 0;
        if (this.altezza < 0.8){
            altezza = 0.8;
        }
        if (this.peso < 20){
            this.peso = 20;
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
