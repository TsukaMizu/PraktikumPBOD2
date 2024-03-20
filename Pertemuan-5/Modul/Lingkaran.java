import static java.lang.Math.PI;
class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(){
        this.jejari= jejari;
    }

    public Lingkaran(double r){
        jejari = r;
    }

    public double hitungLuas(){
        return PI*jejari*jejari;
    }
}
