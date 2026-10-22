import java.time.Duration;

public class Canzone {
    private String titolo;
    private Duration durata;
    private String artista;

    public Canzone(String titolo, Duration durata, String artista) {
        this.titolo = titolo;
        this.durata = durata;
        this.artista = artista;
    }

    public String getTitolo() {
        return titolo;
    }

    public Duration getDurata() {
        return durata;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        long minuti = durata.toMinutes();
        long secondi = durata.toSeconds() % 60;
        return "Titolo: " + titolo + "\n" +
                "Durata: " + minuti + " minuti e " + secondi + " secondi\n" +
                "Artista: " + artista;
    }
}