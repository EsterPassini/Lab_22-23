import java.util.ArrayList;
import java.util.Scanner;

public class Segmento2d {
    //overwiev: classe che modella un segmento sul piano cartesiano
    final Punto2d a,b;


    //costruttori
    public Segmento2d (Punto2d a, Punto2d b) throws IllegalArgumentException{
        //modifies: this
        // effects: inizializzo un segmento con 2 punti
        //          se i punti sono nulli o uguali lancio un IllegalArgumentException
        if (a ==null)
            throw new IllegalArgumentException(" il punto non puo essere nullo");
        if (b ==null)
            throw  new IllegalArgumentException(" il punto non puo essere nullo");
        if (a.equals(b))
            throw  new IllegalArgumentException(" il punto non puo essere nullo");

        this.a = a;
        this.b = b;
    }

    public Punto2d getA(){
        return this.a;
    }

    public Punto2d getB(){
        return this.b;
    }

    public double length() {
        //effects: restituisce la lunghezza del segmento
        double c1 = (this.getA().getX() -this.getB().getX());
        double c2 = (this.getA().getY() -this.getB().getY());

        return Math.sqrt(c1*c1 + c2*c2);
    }

    private boolean repOK(){ // le invarianti sono che a e b non devono essere nulli e non devono essere uguali
        if (this.a == null)
            return false;
        if (this.b == null)
            return false;
        if (this.a.equals(b))
         return false;

        return true;
    }

    @Override
    public String toString() {
        return "segmento: puntoA:"+this.getA() + "puntoB :" +this.getB() + this.length();
    }

public static void main(String[] args) {
    Scanner tastiera = new Scanner(System.in);
    ArrayList<Segmento2d> l = new ArrayList<Segmento2d>();
    double minlength = Double.parseDouble(args[0]);

    System.out.println("inserisci i segmenti");
    while (tastiera.hasNext()){
        double ax = Double.parseDouble(tastiera.next());
        double ay = Double.parseDouble(tastiera.next());
        double bx = Double.parseDouble(tastiera.next());
        double by = Double.parseDouble(tastiera.next());
        l.add(new Segmento2d(new Punto2d(ax, ay), new Punto2d(bx, by)));

    }

    System.out.println("  seg di len > di  " + minlength);
    for (Segmento2d seg : l){
        if (seg.length() > minlength){
            System.out.println(seg);
        }
    }


    tastiera.close();
}
}