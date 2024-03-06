/*
 * File         : ExceptionOnArray.java
 * DEskripsi    : Program penggunaan eksepsi menggunakan class library Java
 */

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arrayIntegers = new Integer[4];
        try{
            arrayIntegers[2] = 11;
            arrayIntegers[4] = 10;
        }
        catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }
        finally{
            System.out.println("clean up code...");
        }
    }
}
