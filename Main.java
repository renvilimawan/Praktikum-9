public class Main {

  public static void main(String[] args) {

    Buku buku1 = new Buku("A201", "Pemrograman Berorientasi Objek");
    BukuLuar buku2 = new BukuLuar("Z102", "Trik Sulap");
    Petugas petugas1 = new Petugas("Imawan", "001");
    Peminjam mhs1 = new Mahasiswa();
    mhs1.setNamaPeminjam("Renvil");
    mhs1.setKodePeminjam("G0032");

    mhs1.doLogin();
    // mhs1.doLogout();

      try{
          Peminjaman peminjaman = new Peminjaman(mhs1, petugas1, buku1);
          
          System.out.println("Nama Peminjam : " + peminjaman.getPeminjam().getNamaPeminjam());
          System.out.println("Kode Peminjam : " + peminjaman.getPeminjam().getKodePeminjam());
          System.out.println("Nama Petugas : " + peminjaman.getPetugas().getNamaPetugas());
          System.out.println("Judul Buku : " + peminjaman.getBuku().getNamaBuku());
      } catch(Exception e) {
          System.out.println("Terjadi Kesalahan : " + e.getMessage());
      } finally {
          System.out.println("Program Selesai");
      }
    }
  }