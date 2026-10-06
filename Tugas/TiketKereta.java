package Tugas;

public class TiketKereta extends Tiket {
    protected int nomorGerbong;
    protected String nomorKursi;

    public TiketKereta() {
    }

    public TiketKereta(String kodeTiket, String namaPenumpang, String asal, String tujuan,
                       int hargaDasar, int nomorGerbong, String nomorKursi) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar);
        this.nomorGerbong = nomorGerbong;
        this.nomorKursi = nomorKursi;
    }

    public void tampilKereta() {
        System.out.println("============ Tiket Kereta ============");
        super.tampilTiket();
        System.out.printf("%-15s= %d%n", "Nomor Gerbong", nomorGerbong);
        System.out.printf("%-15s= %s%n", "Nomor Kursi", nomorKursi);
        System.out.printf("%-15s= %d%n", "Total Bayar", getHargaDasar());
    }
}