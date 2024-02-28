public class Garis {
    //Atribut
    private Titik titikAwal;
    private Titik titikAkhir;
    //Metode
    public Garis(Titik titikAwal, Titik titikAkhir){
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    }
    public Titik getTitikAwal(){
        return this.titikAwal;
    }

    public Titik getTitikAkhir(){
        return this.titikAkhir;
    }

    public void setTitikAwal(Titik tl){
        this.titikAwal = tl;
    }

    public void setTitikAkhir(Titik tr){
        this.titikAkhir = tr;
    }

    public double getPanjang(){
        return Math.sqrt(Math.pow(this.titikAkhir.getAbsis() - this.titikAwal.getAbsis(), 2) +Math.pow(this.titikAkhir.getOrdinat() - this.titikAwal.getOrdinat(), 2));
    }

    public double gradien(){
        double deltaX = this.titikAkhir.getAbsis() - this.titikAwal.getAbsis();
        double deltaY = this.titikAkhir.getOrdinat() - this.titikAwal.getOrdinat();
        return deltaY/deltaX;
    }

    public Garis getRefleksiY(){
        Titik titikAwalRefleksi = titikAwal.getRefleksiY();
        Titik titikAkhirRefleksi = titikAkhir.getRefleksiY();;
        return new Garis(titikAwalRefleksi, titikAkhirRefleksi);
    }

    public boolean isTegakLurus(Garis G){
        double gradienG = G.gradien();
        double gradienIni = gradien();

        if (Math.abs(gradienIni * gradienG + 1) < 1e-9){
            return true;
        }
        else{
            return false;
        }
    }


}
