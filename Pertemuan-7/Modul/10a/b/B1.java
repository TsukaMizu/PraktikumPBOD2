/* 
 * File      : B1.java 
 * Penulis   : David Cristian Batubara
 * Deskripsi : Polimorfisme Ad Hoc: Coercion
 */

public class B1 {
    public static void main(String[] args) {
        int output = 'a';
        System.out.println(output);
        /*
         * Penjelasan:
         * Karena tipe data char lebih kecil dari tipe data int, maka nilai dari tipe data char dapat di-assign ke tipe data int.
         * Pada kode di atas, nilai dari tipe data char 'a' di-assign ke tipe data int output.
         * Maka, output yang dihasilkan adalah 97, yang merupakan nilai ASCII dari karakter 'a' (coercion dari char ke int)
         */
    }
}