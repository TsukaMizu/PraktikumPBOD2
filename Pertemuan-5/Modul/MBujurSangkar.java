/**
 * MBujurSangkar.java
 * Penulis : David Cristian Batubara
 * Deskripsi : Kelas yang mengimplementasikan cara menghitung luas bujur sangkar
 * 
 */

import java.util.Scanner;

class MBujurSangkar{
    public static void main(String[] arga){
        Scanner scan = new Scanner(System.in);
        BujurSangkar bs = new BujurSangkar();
        System.out.print("Masukkan sisi Bujur Sangkar : ");
        double sisi = scan.nextDouble();
        System.out.println("Luas bujur sangkar dengan sisi " + sisi + " satuan adalah "+ bs.hitungLuas(sisi));
    }
}