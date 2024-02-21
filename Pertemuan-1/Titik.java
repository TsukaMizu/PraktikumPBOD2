
public class Titik {
    //Atribut
    double absis;
    double ordinat;
    static int counter;

    //Constructor
    Titik(double a, double o){
        absis = a;
        ordinat = o;
        counter++;
    }
    
    Titik(){
        absis = 0;
        ordinat = 0;
        counter++;
    }

    public void setAbsis(double a) {
        absis = a;
    }

    public void setOrdinat(double o) {
        ordinat = o;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    static int getCounter(){
        return counter;
    }    
}