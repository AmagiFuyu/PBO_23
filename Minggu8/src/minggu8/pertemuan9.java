/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu8;
import java.util.Scanner;
/**
 *
 * @author Benny Alaster
 */
public class pertemuan9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Masukkan Angka Pertama: ");
            int num1 = input.nextInt();
            System.out.println("Masukkan Angka Kedua: ");
            int num2 = input.nextInt();
            int hasil = num1 / num2;
            System.out.println("Hasil Pembagian: " + hasil);
        }catch (ArithmeticException e){
            System.out.println("Terjadi Error: "+e.getMessage());
            System.out.println("Silakan Coba lagi.");
        }finally {
            System.out.println("program selesai.");
        }
    }
    
}
