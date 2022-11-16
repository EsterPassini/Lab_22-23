public class Punto3d extends Punto2d{
    //overwiew: classe immutabile che modella un punto in space 3d
final Punto2d p;
    final double z;

    //costruttote
    public Punto3d (double x, double y, double z){
        //mod: this
        //effect: inizializzo un punto 3d
        this.p = new Punto2d(x, y);
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
        if (obj instanceof Punto3d){
            Punto3d punto = (Punto3d)obj;
            if ((this.x == punto.x) && (this.y == punto.y) && (this.z == punto.z)){
                return true;
            }
        } 
        return false;
    }
    


public static void main(String[] args) {
    Punto2d p = new Punto3d (2, 3, 5);
    Punto2d q = new Punto2d (2, 3);
    Punto2d p2 = new Punto3d(2,3, 6);
}

}
