package Tugas;

public class TiketInternasional extends TiketPesawat {
    protected String nomorPaspor;
    protected int asuransi;

    public TiketInternasional() {
    }

    public TiketInternasional(String kodeTiket, String namaPenumpang, String asal, String tujuan,
                              int hargaDasar, String maskapai, int beratBagasi,
                              String nomorPaspor, int asuransi) {
        super(kodeTiket, namaPenumpang, asal, tujuan, hargaDasar, maskapai, beratBagasi);
        this.nomorPaspor = nomorPaspor;
        this.asuransi = asuransi;
    }

    public void tampilInternasional() {
        System.out.println("====== Tiket Pesawat Internasional ======");
        super.tampilPesawat();
        System.out.printf("%-15s= %s%n", "Nomor Paspor", nomorPaspor);
        System.out.printf("%-15s= %d%n", "Asuransi", asuransi);
        System.out.printf("%-15s= %d%n", "Total Bayar", getHargaDasar() + hitungBiayaBagasi() + asuransi);
    }
}