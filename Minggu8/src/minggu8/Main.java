
package minggu8;
import java.util.ArrayList;
/**
 *
 * @author Benny Alaster
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("apel");
        list.add("Pisang");
        list.add("Ceri");
        list.add("Duren");
        
        System.out.println("Elemen pada indeks ke-0: " + list.get(0));
        System.out.println("Elemen pada indeks ke-2: " + list.get(2));
        
        list.remove("Ceri");
        System.out.println("Setelah menghapus ceri: ");
        for(String s : List){
            System.out.println("s");
        }
        System.out.println("Ukuran ArrayList: " + list.size()); 
    }
    
}
