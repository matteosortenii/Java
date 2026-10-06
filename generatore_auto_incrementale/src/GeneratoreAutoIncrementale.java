public class GeneratoreAutoIncrementale {
    private String lettere;
    private int n_cifre;
    private int ultimoValore = 0;

    public GeneratoreAutoIncrementale(String lettere, int n_cifre) {
        this.lettere = lettere;
        this.n_cifre = n_cifre;
    }

    public String genera() {
        if (ultimoValore >= Math.pow(10, n_cifre) - 1) {
            return "Codici esauriti";
        }

        ultimoValore++;

        String numero = Integer.toString(ultimoValore);

        for (int i = 0; numero.length() < n_cifre; i++) {
            numero = "0" + numero;
        }

        return lettere + numero;
    }

    @Override
    public String toString() {
        return "Prefisso: " + lettere +
                " ultimo valore generato: " + ultimoValore;
    }
}
