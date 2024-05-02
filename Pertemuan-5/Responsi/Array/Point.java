package Array;

public class Point {
    private double absis;
    private double ordinat;

    public Point(double x, double y){
        this.absis = x;
        this.absis = y;
    }

    public double getAbsis(){
        return absis;
    }

    public void setAbsis(double x){
        absis = x;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public void setOrdinat(double y){
        ordinat = y;
    }
    
    public void cetak(){
        System.out.println('['+absis + ',' +ordinat+']');
    }

}
