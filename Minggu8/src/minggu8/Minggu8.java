/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minggu8;

/**
 *
 * @author Benny Alaster
 */
public class Minggu8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int angka[] = new int [5];
        
        angka[0]= 1;
        angka[1]= 2;
        angka[2]= 3;
        angka[3]= 4;
        angka[4]= 5;
        
    for (int i = 0; i<angka.length; i++){
            System.out.println("Angka ke-" + (i+1) + "adalah " + angka[i]);
        }
    }
}