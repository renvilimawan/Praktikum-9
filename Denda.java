// Nama   : Renvil Imawan
// NIM    : G.111.20.0032
// Matkul : Pemrograman Berorientasi Objek

public class Denda{
    private Peminjaman peminjaman;
    private int hariTerlambat;
    private int TARIF_DENDA = 10000;

    public Denda(Peminjaman peminjaman, int hariTerlambat){
        this.peminjaman = peminjaman;
        this.hariTerlambat = hariTerlambat;
    }

    public Peminjaman getPeminjaman() {
        return this.peminjaman;
    }

    public int getTagihan(){
        return this.TARIF_DENDA * this.hariTerlambat;
    }
}