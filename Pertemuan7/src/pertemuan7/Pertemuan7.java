package pertemuan7;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Pertemuan7{
    public static void main(String[] ars) {
    String nama;
    String bb = JOptionPane.showInputDialog("Nama: ");
    Scanner x = new Scanner(System.in);
    
    System.out.print("Masukkan nama anda: ");
    nama = x.nextLine();
    
    System.out.print("Nama anda adalah: "+nama);
    System.out.print("Nama anda adalah ke-1: "+bb);
    System.out.print("Panjang nama: "+nama.length());
    }
}
 

