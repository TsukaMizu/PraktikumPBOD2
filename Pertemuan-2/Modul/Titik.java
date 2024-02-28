
public class Titik {
    //Atribut
    private double absis;
    private double ordinat;
    private static int counter;

    //Constructor
    public Titik(double a, double o){
        this.absis = a;
        this.ordinat = o;
        counter++;
    }
    
    public Titik(){
        this(0,0);
        counter++;
    }

    public void setAbsis(double a) {
        this.absis = a;
    }

    public void setOrdinat(double o) {
        this.ordinat = o;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public static int getCounter(){
        return counter;
    }
    
    public double getJarakPusat(){
        return Math.sqrt(Math.pow(this.absis, 2)+ Math.pow(this.ordinat, 2));
    }

    public void refleksiX(){
        this.ordinat *= -1;
    }

    public  void refleksiY(){
        this.absis *= -1;
    }

    public Titik getRefleksiX(){
        return new Titik(this.absis, -this.ordinat);
    }

    public Titik getRefleksiY(){
        return new Titik(-this.absis, this.ordinat);
    }
}