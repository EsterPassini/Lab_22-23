public class Punto3d extends Punto2d{
    //overwiew: classe immutabile che modella un punto in space 3d
    final double z;

    //costruttote
    public Punto3d (double x, double y, double z){
        //mod: this
        //effect: inizializzo un punto 3d
        super(x, y); //richiama il costruttore del padre
        this.z = z;

    }

    @Override
    public String toString() {
        return "punto3d -x: " + this.getX() +";  -y: "+  this.getY() +";  -z: "+  this.getZ();
    }

    public double getZ() {
        return z;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getClass().equals(obj.getClass()))
        if (obj instanceof Punto3d){
            Punto3d p = (Punto3d)obj;
            if ((this.x == p.x) && (this.y == p.y) && (this.z == p.z)){
                return true;
            }
        } /*else if (obj instanceof Punto2d){
            Punto2d p = (Punto2d) obj;
            if ((this.x == p.x) && (this.x == p.x)){
                return true;
            }
        }*/
        return false;
    }
    


public static void main(String[] args) {
    Punto2d p = new Punto3d (2, 3, 5);
    Punto2d q = new Punto2d (2, 3);
    Punto2d p2 = new Punto3d(2,3, 6);
}

}
