/* 
 * File      : B3.java 
 * Penulis   : David Cristian Batubara
 * Deskripsi : Polimorfisme Ad Hoc: Coercion
 */

 public class B3 {
    public static void main(String[] args) {
        int y = 25;
        double output = y;
        System.out.println(output);
        /*
         * Penjelasan:
         * Karena tipe data int lebih kecil dari tipe data double, maka nilai dari tipe data int dapat di-assign ke tipe data double.
         * Pada kode di atas, nilai dari tipe data int 25 di-assign ke tipe data double output.
         * Maka, output yang dihasilkan adalah 25.0 (coercion dari int ke double).
         */
    }
}