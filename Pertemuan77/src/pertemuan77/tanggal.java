
package pertemuan77;
import java.util.Scanner;
public class tanggal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama hari: ");
        
        String hari = sc.nextLine();
        
        switch(hari.toLowerCase()) {
            case "senin" : System.out.println("Hari ke-1"); break;
            case "selasa": System.out.println("Hari ke-2"); break;
            case "rabu"  : System.out.println("Hari ke-3"); break;
            case "kamis" : System.out.println("Hari ke-4"); break;
            case "jumat" : System.out.println("Hari ke-5"); break;
            case "sabtu" : System.out.println("Hari ke-6"); break;
            case "minggu": System.out.println("Hari ke-7"); break;
            default:
                System.out.println("Nama hari tidak valid");
        }
    }
    
}
