/**
 * @author
 * NAMA     : EliAgusMilah
 * KELAS    : PBO2
 * NIM      : 2014436079
 * Deskripsi Program : Manampilkan barang antik. Clild class dipanggil oleh Parent class, di
 * class BarangAntik(parent class) terdapat prosedur tampilUmur untuk menampilkan umur barang antik
 *
 */
public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio(234);
        radio.setNama("Radio AM");
        System.out.println("Nama barang antik : "+radio.getNama());
        radio.tampilUmur();
    }
}
