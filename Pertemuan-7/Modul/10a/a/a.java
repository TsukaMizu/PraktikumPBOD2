/* 
 * File      : a.java   
 * Penulis   : David Cristian Batubara
 * Deskripsi : Polimorfisme Ad Hoc: Overloading
 */

/*
 * Polimorfisme Ad Hoc: Overloading
 * 
 * Polimorfisme jenis ini memanfaatkan kemampuan method overloading, di mana beberapa
 * method dengan nama yang sama dapat ada dalam sebuah kelas, namun dengan parameter yang
 * berbeda. Syarat-syarat untuk mendapatkan method overloading adalah:
 * 
 * 1. Nama method harus sama.
 * 2. Parameter-list harus berbeda dalam jumlah atau tipe data.
 * 3. Urutan parameter tidak bisa menjadi faktor pembeda.
 * 
 * Contoh:
 */

class Calculator {
    // Method overloading
    public int add(int a, int b) {
        return a + b;
    }

    // Method overloading
    public double add(double a, double b) {
        return a + b;
    }
}

public class a {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(1, 2)); // 3
        System.out.println(calculator.add(1.5, 2.5)); // 4.0
    }
}