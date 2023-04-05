package pertemuan7;

import java.util.Scanner;

public class AreaofCircle {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jari-jari: ");
        double jari = sc.nextDouble();
        double luas = Math.PI * Math.pow(jari, 2);
        System.out.println("Luas lingkaran: "+ luas);
    }
    
}
