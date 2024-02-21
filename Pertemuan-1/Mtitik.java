
public class Mtitik {
    static int counter;
    public static void main (String[] args){      
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        //Overloading
        Titik t3 = new Titik(5,6);

        int counterTitik = Titik.getCounter();

        System.out.printf("Jumlah Objek Titik: %d\n",counterTitik);
        System.out.printf("t1 memiliki Absis: %.2f dan Ordinat: %.2f\n", t1.getAbsis(), t1.getOrdinat());
        System.out.printf("t2 memiliki Absis: %.2f dan Ordinat: %.2f\n", t2.getAbsis(),t2.getOrdinat());
        System.out.printf("t3 memiliki Absis: %.2f dan Ordinat: %.2f\n", t3.getAbsis(),t3.getOrdinat());
        
    }
}