package Apps;

public class Kendaraan {
    private String jenisKendaraan, pesananKendaraan; 
    private int jumlah;
    private long harga;

    public Kendaraan(String jenisKendaraan, String pesananKendaraan, int jumlah, long harga) {
        this.jenisKendaraan = jenisKendaraan;
        this.pesananKendaraan = pesananKendaraan;
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public void Opening() {
        System.out.println();
        System.out.println("===============================================");
        System.out.println("\t| SELAMAT DATANG TEMAN |");
        System.out.println("| Pilihlah dengan bijak sesuai fashion anda |");
        System.out.println("===============================================");
        System.out.println();
    }


    public void Pesanan() {
        System.out.println();
        System.out.println("======================================");
        System.out.println("| PESANAN BERHASIL DENGAN DETAIL |");
        System.out.println("Jenis Kendaraan\t\t: " + jenisKendaraan);
        System.out.println("Merk Kendaraan\t\t: " + pesananKendaraan);
        System.out.println("Jumlah Pesanan\t\t: " + jumlah);
        System.out.println("Total\t\t\t: Rp " + harga + " Juta");
        System.out.println("TERIMAKASIH SUDAH MEMESAN DISINI");
        System.out.println("======================================");
        System.out.println();
    }

    public void Closing() {
        System.out.println();
        System.out.println("======================================================");
        System.out.println("| programming is so much more than just writing code |");
        System.out.println("\t| it is a reflection of you |");
        System.out.println("======================================================");
        System.out.println();
    }

}

