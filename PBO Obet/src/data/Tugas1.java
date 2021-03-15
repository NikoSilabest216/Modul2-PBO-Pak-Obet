package data;
import java.util.Arrays;
class Anggota{
    private String daftarAnggota[];
    private int jumlah;
    private boolean penuh;

    public Anggota(int max){
        this.daftarAnggota = new String[max];
        jumlah=0;
    }

    public String[] getDaftarAnggota() {
        return daftarAnggota;
    }

    public void setDaftarAnggota(String[] daftarAnggota) {
        this.daftarAnggota = daftarAnggota;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public boolean isPenuh() {
        return penuh;
    }

    public void setPenuh(boolean penuh) {
        this.penuh = penuh;
    }

    public void info(){
        System.out.println("Jumlah : "+getJumlah());
        System.out.println("---- Daftar Anggota ----");
        for (int i=0; i<jumlah;i++){
            System.out.println(this.daftarAnggota[i]);
        }
    }

    public boolean isKosong(){
        if (getJumlah()==0) return true;
        else return false;
    }

    public void format(){
        setJumlah(0);
        Arrays.fill(this.daftarAnggota, null);
        System.out.println("Berhasil menghapus semua data anggota");
    }

    public void tambahAnggota(String anggotaBaru){
        if (isPenuh()){
            System.out.println("Anggota sudah penuh!!");
        }else{
            this.daftarAnggota[this.jumlah] = anggotaBaru;
            this.jumlah++;
            if (getJumlah()>=getDaftarAnggota().length){
                setPenuh(true);
            }
        }
    }

    public void hapusAnggota(){
        if (isKosong()){
            System.out.println("Menghapus anggota gagal!!");
        }else{
            this.jumlah--;
            this.daftarAnggota[jumlah] = "";
            System.out.println("Berhasil menghapus anggota!!");
        }
    }
}

public class Tugas1 {
     public static void main(String[] args) {
        Anggota anggota = new Anggota(5);
        anggota.tambahAnggota("Choirul");
        anggota.tambahAnggota("Hakkan");
        anggota.tambahAnggota("Deva");
        anggota.tambahAnggota("Niko");
        anggota.tambahAnggota("Adit");
        System.out.println("max : "+anggota.getDaftarAnggota().length);
        anggota.info();
        anggota.tambahAnggota("Alif");
        anggota.hapusAnggota();
        anggota.tambahAnggota("Anyar");
        anggota.info();
    }
}
