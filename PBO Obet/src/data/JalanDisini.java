package data;
import java.util.ArrayList;
class Anggota 
{
     private String daftarAnggota[];
     private int jumlah;
     private boolean penuh;
     
     public Anggota(int max)
     {
         this.daftarAnggota=new String[max];
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
    
     public void info()
     {
         System.out.println("Jumlah: "+getJumlah());
         System.out.println("Daftar Anggota: ");
         for(int i=0; i<jumlah; i++)
         {
             System.out.println("Indeks ke-"+i+": Anggotanya: "+daftarAnggota[i]);
         }
     }
     public boolean isKosong()
     {
         if(getJumlah()==0)
         return true;
         else
         return false;
     }
     public void format()
     {
         setJumlah(0);
         setDaftarAnggota(null);
         System.out.println("Semua Anggota Hilang hiya hiya hiya");
     }
     public void tambahAnggota(String anggotaBaru)
     {
         if(isPenuh()== true)
         {
             System.out.println("Database penuh bosq gabisa ya bosq");
         }
         else
         {
             this.daftarAnggota[this.jumlah]=anggotaBaru;
             this.jumlah++;
             if(getJumlah()>=getDaftarAnggota().length)
             {
                 setPenuh(true);
                 System.out.println("Udah penuh bosq");
             }
         }
     }
     public void hapusAnggota()
     {
         if(isKosong())
         {
             System.out.println("Tidak ada anggota gimana mau menghapus bang");
         }
         else
         {
             this.jumlah--;
             ArrayList baru = new ArrayList();
             baru.remove(this.daftarAnggota[jumlah]); 
             System.out.println("Satu Anggota berhasil dihapus");
         }
     }
}

public class JalanDisini 
{
    public static void main(String[] args) 
    {
        Anggota daftar = new Anggota(2);
        daftar.tambahAnggota("Pak Obet");
        daftar.tambahAnggota("Niko Silabest");
        System.out.println("Jumlah maksimal: "+daftar.getDaftarAnggota().length);
        daftar.info();
        daftar.tambahAnggota("Impostor");
        daftar.hapusAnggota();
        daftar.info();
        daftar.format();
        daftar.info();
    }
}
