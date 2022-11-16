public class Punto2d{
    //overview: classe che modella un punto immutabile sul piano cartesiano
    final double x, y;

    //costruttori
    public Punto2d(double x, double y){
        //MODIFIES: this
        //effects: inizializza un nuovo punto 2d
        this.x = x;
        this.y = y;
    }

    public Punto2d(){
        //MODIFIES: this
        //effects: inizializza un nuovo punto 2d con cordinate 0, 0
        this.x = 0;
        this.y = 0;
    }

    public double getX(){
        return this.x;
    }

    public double getY(){
        return this.y;
    }


    @Override
    public String toString() {
        return "punto2d -x: " + this.getX() +";  -y: "+  this.getY() ;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Punto2d){
            Punto2d p = (Punto2d)obj ;
            if( (this.x == p.x) && (this.y == p.y)){
                return true;
            }
        }
        return false;
    }



}