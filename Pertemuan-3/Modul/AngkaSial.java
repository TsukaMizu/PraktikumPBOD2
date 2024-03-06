/*
 * File      : AngkaSial.java
 * Deskripsi : Program penggunaan exeption buatan sendiri pengenal klasusa 'throw' dan 'throws'
 */

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if (angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka !!!");
        }
    }
}
