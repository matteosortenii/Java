import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist("Playlist Rap Italiano");

        Canzone c1 = new Canzone("Cenere", Duration.ofMinutes(3).plusSeconds(30), "Lazza");
        Canzone c2 = new Canzone("Panico", Duration.ofMinutes(3).plusSeconds(15), "Lazza");

        playlist.add(c1);
        playlist.add(c2);

        System.out.println("stato iniziale");
        System.out.println(playlist);
        System.out.println();

        playlist.play();
        System.out.println("dopo il play");
        System.out.println(playlist);
        System.out.println();

        playlist.branoSuccessivo();
        System.out.println("brano successivo");
        System.out.println(playlist);
        System.out.println();

        Duration totale = playlist.durataTotale();
        System.out.println("Durata totale della playlist: " + totale.toMinutes() + " minuti e " + (totale.toSeconds() % 60) + " secondi");
    }
}