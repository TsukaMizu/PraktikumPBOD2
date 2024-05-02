/* 
 * File      : B5.java    
 * Penulis   : David Cristian Batubara
 * Deskripsi : Polimorfisme Ad Hoc: Coercion
 */

 public class B5 {
    public static void main(String[] args) {
        char a = 'a';
        double output = a;
        System.out.println(output);
        /*
         * Penjelasan:
         * Karena tipe data char lebih kecil dari tipe data double, maka nilai dari tipe data char dapat di-assign ke tipe data double.
         * Pada kode di atas, nilai dari tipe data char 'a' di-assign ke tipe data double output.
         * Maka, output yang dihasilkan adalah 97.0, yang merupakan nilai ASCII dari karakter 'a' (coercion dari char ke double).
         */
    }
}