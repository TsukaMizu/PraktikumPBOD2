public class Lingkaran extends BangunDatar {
    private double jejari;

    public Lingkaran(double jejari){
        this.jejari = jejari;
    }

    public double hitungkeliling(){
        return 2*jejari*3.14;
    }
}
