package minggu.pkg9;


public class ScopeTest {

  
    public static void main(String[] args) {
        int i = 0;
        
        for( i = 64; i > 0; i = i/2){
        System.out.println(i + "");
    }
        System.out.println(i);
        
        System.out.println("");
        for(int j = 0; j<=5; j++){
            System.out.println(j + "");
        }
        System.out.println("");
        for(int j = 8; j>= 0; j--){
            System.out.println(j + "");
        }
        System.out.println();
        for(int k = 2; k <= 64; k=k * 2){
            System.out.print(k + "");
        }
    }
    
}
