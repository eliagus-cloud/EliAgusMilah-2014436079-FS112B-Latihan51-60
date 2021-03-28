/**
 * @author
 * NAMA     : EliAgusMilah
 * KELAS    : PBO2
 * NIM      : 2014436079
 * Deskripsi Program : Menampilkan diri Anda menggunakan sifat inheritance dan polymorphism
 *
 */
public class Main {
    public static void main(String[] args) {
        Dosen dosen = new Dosen();
        dosen.setNip("2222222222");
        dosen.setNama("Fernando Siboro");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");

        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();

        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("2014436079");
        mahasiswa.setNama("EliAgusMilah");
        mahasiswa.setUmur(20);
        mahasiswa.setKelas("PBO2");

        System.out.println("\nNIP MAHASISWA : "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
}
