public class Angolo {
    private int gradi;
    private int primi;
    private int secondi;

    public Angolo(int gradi, int primi, int secondi){
        this.gradi = gradi;
        this.primi = primi;
        this.secondi = secondi;
    }

    public void setGradi(int gradi) {
        this.gradi = gradi;
    }

    public void setPrimi(int primi) {
        this.primi = primi;
    }

    public void setSecondi(int secondi) {
        this.secondi = secondi;
    }

    public Angolo sommaAngolo (Angolo a){
        int g = this.gradi + a.gradi;
        int p = this.primi + a.primi;
        int s = this.secondi + a.secondi;

        p = p + s / 60;
        s = s % 60;

        g = g + p / 60;
        p = p % 60;

        g = g % 360;

        return new Angolo(gradi, primi, secondi);
    }

    public Angolo sottraiAngolo (Angolo a){
        int g = this.gradi - a.gradi;
        int m = this.primi - a.primi;
        int s = this.secondi - a.secondi;

        if (s < 0) {
            s = s + 60;
            m = m - 1;
        }

        if (m < 0) {
            m = m + 60;
            g = g - 1;
        }

        if (g < 0) {
            g = g + 360;
        }

        return new Angolo(g, m, s);
    }
}
