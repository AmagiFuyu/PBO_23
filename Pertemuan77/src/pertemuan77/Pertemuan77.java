package pertemuan77;
import java.util.Scanner;

public class Pertemuan77 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nilai anda: ");
        int nilai = input.nextInt();
        
        if (nilai >= 80) {
            System.out.println("Nilai A");
        }else if (nilai >= 70) {
            System.out.println("Nilai B");
        }else if (nilai >= 60) {
            System.out.println("Nilai C");
        }else if (nilai >= 50) {
            System.out.println("Nilai D");
        }else if (nilai < 50) {
            System.out.println("Nilai E");
        }
        else {
                System.out.println("Input nilai tidak valid");
                }
    }
}
