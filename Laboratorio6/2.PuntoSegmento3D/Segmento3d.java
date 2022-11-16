import java.util.ArrayList;
import java.util.Scanner;

public class Segmento3d {
    //overwiev: classe che modella un segmento sul piano cartesiano
    final Punto3d a,b;


    //costruttori
    public Segmento3d (Punto3d a, Punto3d b) throws IllegalArgumentException{
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

    public Punto3d getA(){
        return this.a;
    }

    public Punto3d getB(){
        return this.b;
    }


    public double length() {
        //effects: restituisce la lunghezza del segmento
        double c1 = (this.a.x - this.b.x);
        double c2 = (this.a.y - this.b.y);
        double c3 = (this.a.z - this.b.z);

        return Math.sqrt(c1*c1 + c2*c2 + c3*c3);
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
        return "segmento: puntoA:"+this.a + "puntoB :" +this.b+ " len: " + this.length();
    }

public static void main(String[] args) {
    Scanner tastiera = new Scanner(System.in);
    ArrayList<Segmento3d> l = new ArrayList<Segmento3d>();
    double minlength = Double.parseDouble(args[0]);

    System.out.println("inserisci i segmenti");
    while (tastiera.hasNext()){
        double ax = Double.parseDouble(tastiera.next());
        double ay = Double.parseDouble(tastiera.next());
        double az = Double.parseDouble(tastiera.next());
        
        double bx = Double.parseDouble(tastiera.next());
        double by = Double.parseDouble(tastiera.next());
        double bz = Double.parseDouble(tastiera.next());
        
        l.add(new Segmento3d(new Punto3d(ax, ay, az ), new Punto3d(bx, by, bz)));

    }

    System.out.println("  seg di len > di  " + minlength);
    for (Segmento3d seg : l){
        if (seg.length() > minlength){
            System.out.println(seg);
        }
    }


    tastiera.close();
}
}