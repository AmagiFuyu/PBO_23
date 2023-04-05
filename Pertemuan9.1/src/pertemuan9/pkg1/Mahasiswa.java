package pertemuan9.pkg1;

public class Mahasiswa {
    private String nama;
    private String nim;
    private int umur;

public Mahasiswa(){
    this.nama = "Tidak Diketahui";
    this.nim = "Tidak Diketahui";
    this.umur = 0;
    }
public Mahasiswa(String nama){
    this.nama = "nama";
    this.nim = "Tidak Diketahui";
    this.umur = 0;
    }
public Mahasiswa(String nama, String nim){
     this.nama = "nama";
    this.nim = "nim";
    this.umur = 0;
    }
}