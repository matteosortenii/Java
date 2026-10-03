public class Rettangolo {
    private Punto puntoA;
    private Punto puntoB;

    public Rettangolo(Punto puntoA, Punto puntoB){
        this.puntoA = puntoA;
        this.puntoB = puntoB;
    }

    public double getBase(){
        return Math.abs(puntoA.getX() - puntoB.getX());
    }

    public double getAltezza(){
        return Math.abs(puntoA.getY() - puntoB.getY());
    }

    public double getPerimetro(){
        return 2*(getAltezza()+ getBase());
    }

    public double getArea(){
        return getAltezza() * getBase();
    }
}
