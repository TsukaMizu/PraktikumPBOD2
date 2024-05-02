/* 
 * File      : B2.java
 * Penulis   : David Cristian Batubara
 * Deskripsi : Polimorfisme Ad Hoc: Coercion
 */

 public class B2 {
    public static void main(String[] args) {
        double x = 15.5;
        int output = x;
        System.out.println(output);
        /*
         * Penjelasan:
         * Karena tipe data double lebih besar dari tipe data int, maka nilai dari tipe data double tidak dapat di-assign ke tipe data int.
         * Pada kode di atas, nilai dari tipe data double 15.5 di-assign ke tipe data int output.
         * Maka, output yang dihasilkan adalah error (tidak dapat melakukan coercion dari double ke int).
         * Error yang dihasilkan adalah: incompatible types: possible lossy conversion from double to int
         */
    }
}