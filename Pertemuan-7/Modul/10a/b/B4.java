/* 
 * File      : B4.java
 * Penulis   : David Cristian Batubara
 * Deskripsi : Polimorfisme Ad Hoc: Coercion
 */

 public class B4 {
    public static void main(String[] args) {
        int z = 78;
        char output = (char) z;
        System.out.println(output);
        /*
         * Penjelasan:
         * Karena tipe data int lebih besar dari tipe data char, maka nilai dari tipe data int tidak dapat di-assign ke tipe data char.
         * Pada kode di atas, nilai dari tipe data int 78 di-assign ke tipe data char output.
         * Maka, output yang dihasilkan adalah N, yang merupakan karakter ASCII dari nilai 78 (coercion dari int ke char).
         */
    }
}