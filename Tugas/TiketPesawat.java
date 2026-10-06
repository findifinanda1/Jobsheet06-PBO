package Tugas;

public class TiketPesawat extends Tiket {
    protected String maskapai;
    protected int beratBagasi;

    public TiketPesawat() {
    }

    public TiketPesawat(String kodeTiket, String namaPenumpang, String asal, String tujuan,
                        int hargaDasar, String maskapai, int beratBagasi) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar);
        this.maskapai = maskapai;
        this.beratBagasi = beratBagasi;
    }

    public int hitungBiayaBagasi() {
        int kelebihan = beratBagasi - 20;
        return kelebihan > 0 ? kelebihan * 50000 : 0;
    }

    public void tampilPesawat() {
        super.tampilTiket();
        System.out.printf("%-15s= %s%n", "Maskapai", maskapai);
        System.out.printf("%-15s= %d kg%n", "Berat Bagasi", beratBagasi);
        System.out.printf("%-15s= %d%n", "Biaya Bagasi", hitungBiayaBagasi());
    }
}