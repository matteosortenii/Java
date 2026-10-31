public class Vettore {
    private Punto origine;
    private Punto vertice;

    public Vettore(Punto origine, Punto vertice) {
        this.origine = origine;
        this.vertice = vertice;
    }

    public Punto getOrigine() {
        return origine;
    }

    public Punto getVertice() {
        return vertice;
    }

    public double calcolaLunghezza(){
        double dx = vertice.getX() - origine.getX();
        double dy = vertice.getY() - origine.getY();
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public void spostaOrigine(Punto p){
        origine.setX(p.getX());
        origine.setY(p.getY());
    }

    public boolean verificaOrigine(Punto p){
        return origine.getX() == p.getX() && origine.getY() == p.getY();
    }

    @Override
    public String toString() {
        return "Vettore{" +
                "origine=" + origine +
                "; vertice=" + vertice +
                '}';
    }
}