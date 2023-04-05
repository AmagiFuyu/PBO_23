package pertemuan9;

public class NamaKu {
    public String nama = "Benny";
    public int umur;
    public String tempatLahir;

    NamaKu(String yodi, int i, String batam) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void tampilNama() {
        System.out.println("Nama Saya: "+nama);
    }
    public void isiProperty(String n, int u, String tL){
        nama = n;
        umur = u;
        tempatLahir = tL;
    }
}
