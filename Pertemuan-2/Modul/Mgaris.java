public class Mgaris {
    public static void main(String[] args) {

        Titik t1 = new Titik(1,1);
        Titik t2 = new Titik(3,4);
        Garis G1 = new Garis(t1, t2);

        Titik t3 = new Titik(2,3);
        Titik t4 = new Titik(4,1);
        Garis G2 = new Garis(t3, t4);

        Titik t5 = new Titik(1,2);
        Titik t6  = new Titik(3,4);
        Garis G3 = new Garis(t5, t6);

        System.out.println("Titik Awal dari Garis G1 adalah " + G1.getTitikAwal().getAbsis() +","+G1.getTitikAwal().getOrdinat());
        System.out.println("Titik Akhir dari Garis G1 adalah "+ G1.getTitikAkhir().getAbsis() + "," + G1.getTitikAkhir().getOrdinat());
        
        System.out.println("Panjang Garis G1 adalah " + G1.getPanjang());
        System.out.printf("Panjang Garis G2 adalah %.2f\n", G2.getPanjang());

        System.out.printf("Gradien dari G1 adalah %.2f\n", G1.gradien());
        System.out.printf("Gradien dari G2 adalah %.2f\n", G2.gradien());

        System.out.println("Merefleksikan Garis G3 pada Sumbu Y " + G3.getRefleksiY().getTitikAwal().getAbsis() + ","+G3.getRefleksiY().getTitikAwal().getOrdinat() + "||" + G3.getRefleksiY().getTitikAkhir().getAbsis() +","+ G3.getRefleksiY().getTitikAkhir().getOrdinat());
        System.out.println("G1 dan G2 Tegak Lurus: " + G1.isTegakLurus(G2));
    }
}
