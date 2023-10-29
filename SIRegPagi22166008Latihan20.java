package pkgLatihan20;
/**
* author
* Nama      :A`isatul Iza
* Nim       :22166008
* Deskripsi : Program ini adalah program yang menampilkan perhitungan lama tabungan sampai mencapai saldo target dengan bunga 8% perbulan menggunakan perulangan for
*/
public class SIRegPagi22166008Latihan20 {
  public static void main(String[] args) {
    //Saldo awal
    double saldoawal= 3500000; 
    //bunga perbulan
    double bunga = 0.08; 
    //target saldo
    double targetsaldo = 6000000;
    //perulangan for
    for (int bulan = 1; bulan <=8 ; bulan++) {
        double saldo = saldoawal * (1 + bunga);
        //output target saldo tabungan
        System.out.printf("Saldo di bulan ke-%d = Rp. %.2f%n", bulan, saldo);
        saldoawal = saldo; 
    }
  }
}
