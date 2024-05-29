import java.util.ArrayList;
/**
 * File : LambdaList.java
 * Deskripsi : Implementasi lambda pada List, digunakana sebagai parameter
 *              pada method
 */
public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        //Lambda digunakan sebagai parameter
        mahasiswaList.forEach((nama) -> System.out.println(nama));
    }
}
