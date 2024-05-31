package Apps;

public class MobilKeluarga {
    // enkapsulasi
    private String mobilKeluarga;
    private long harga;
    private String mobilAvanza = "Avanza";
    private String mobilGrandmax = "Grandmax";
    private String mobilLuxio = "Luxio";
    private int hargaAvanza = 272;
    private int hargaGrandmax = 220;
    private int hargaLuxio = 263;

    // setter & getter
    public void setMobilKeluarga(String mobilKeluarga) {
        this.mobilKeluarga = mobilKeluarga;
    }

    public String getMobilKeluarga() {
        return mobilKeluarga;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public long getHarga() {
        return harga;
    }

    public int getHargaAvanza() {
        return hargaAvanza;
    }

    public int getHargaGrandmax() {
        return hargaGrandmax;
    }

    public int getHargaLuxio() {
        return hargaLuxio;
    }

    public String getAvanza() {
        return mobilAvanza;
    }

    public String getGrandmax() {
        return mobilGrandmax;
    }

    public String getLuxio() {
        return mobilLuxio;
    }

    // method all
    public void pilihanMobilKeluarga() {
        System.out.println("===================");
        System.out.println("1. Avanza");
        System.out.println("2. Grandmax");
        System.out.println("3. Luxio");
        System.out.println("===================");
    }

    public void spekAvanza() {
        System.out.println("==============================");
        System.out.println("| Spesifikasi Kendaraan |");
        System.out.println("Type\t\t: Avanza");
        System.out.println("Jenis Transmisi\t: Manual");
        System.out.println("Harga\t\t: 272 Juta/unit");
        System.out.println("Kapasitas\t: 1496 cc");
        System.out.println("Tahun Pembuatan\t: 2024");
        System.out.println("Konsumsi BBM\t: 12 km/liter");
        System.out.println("Kapasitastangki\t: 43 Liter");
        System.out.println("==============================");
        System.out.println();
    }
    
    
    public void spekGrandmax() {
        System.out.println("==============================");
        System.out.println("| Spesifikasi Kendaraan |");
        System.out.println("Type\t\t: Grandmax");
        System.out.println("Jenis Transmisi\t: Manual");
        System.out.println("Harga\t\t: 220 Juta/unit");
        System.out.println("Kapasitas\t: 1495 cc");
        System.out.println("Tahun Pembuatan\t: 2024");
        System.out.println("Konsumsi BBM\t: 13 km/liter");
        System.out.println("KapasitasTangki\t: 43 Liter ");
        System.out.println("==============================");
        System.out.println();
    }
    
    
    public void spekLuxio() {
        System.out.println("==============================");
        System.out.println("| Spesifikasi Kendaraan |");
        System.out.println("Type\t\t: Luxio");
        System.out.println("Jenis Transmisi\t: Otomatis");
        System.out.println("Harga\t\t: 263 Juta/unit");
        System.out.println("Kapasitas\t: 1495 cc");
        System.out.println("Tahun Pembuatan\t: 2024");
        System.out.println("Konsumsi BBM\t: 11 km/liter");
        System.out.println("KapasitasTangki\t: 43 Liter");
        System.out.println("==============================");
        System.out.println();
    }
    
}
