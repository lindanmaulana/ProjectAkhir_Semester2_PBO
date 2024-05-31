package Apps;

public class MobilBus {
    // enkapsulasi
    private String mobilBus;
    private long harga;
    private String busNormalDeck = "Normal Deck";
    private String busHighDecker = "High Decker";
    private String busSuperHighDecker = "Super High Decker";
    private int hargaNormalDeck = 1000;
    private int hargaHighDecker = 1300;
    private int hargaSuperHighDecker = 2000;

    // setter & getter
    public void setMobilBus(String mobilBus) {
        this.mobilBus = mobilBus;
    }

    public String getmobilBus() {
        return mobilBus;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public long getHarga() {
        return harga;
    }

    public int getHargaNormalDeck() {
        return hargaNormalDeck;
    }

    public int getHargaHighDecker() {
        return hargaHighDecker;
    }

    public int getHargaSuperHighDecker() {
        return hargaSuperHighDecker;
    }

    public String getBusNormalDeck() {
        return busNormalDeck;
    }

    public String getBusHighDecker() {
        return busHighDecker;
    }

    public String getBusSuperHighDecker() {
        return busSuperHighDecker;
    }

    // method all
    public void pilihanMobilBus() {
        System.out.println("===================");
        System.out.println("1. Normal Deck");
        System.out.println("2. High Decker");
        System.out.println("3. Super High Decker");
        System.out.println("===================");
    }

    public void spekNormalDecker() {
        System.out.println("========================================");
        System.out.println("| Spesifikasi Kendaraan |");
        System.out.println("Type\t\t\t: Normal Deck");
        System.out.println("Harga\t\t\t: 1000 Juta/unit");
        System.out.println("Ketinggian\t\t: 3 Meter");
        System.out.println("Kapasitas Penumpang\t: 40 Penumpang");
        System.out.println("Jenis Transmisi\t\t: Manual");
        System.out.println("Jenis Bahan Bakar\t: Diesel");
        System.out.println("Fitur Kenyamanan\t: AC, TV, Audio System");
        System.out.println("========================================");
        System.out.println();
    }
    
    public void spekHighDecker() {
        System.out.println("================================================");
        System.out.println("| Spesifikasi Kendaraan |");
        System.out.println("Type\t\t\t: High Decker");
        System.out.println("Harga\t\t\t: 1300 Juta/unit");
        System.out.println("Ketinggian\t\t: 3,5 Meter");
        System.out.println("Kapasitas Penumpang\t: 45 Penumpang");
        System.out.println("Jenis Transmisi\t\t: Manual");
        System.out.println("Jenis Bahan Bakar\t: Diesel");
        System.out.println("Fitur Kenyamanan\t: AC, TV, Audio System, Toilet");
        System.out.println("================================================");
        System.out.println();
    }
    
    public void spekSuperHighDecker() {
        System.out.println("=================================================================");
        System.out.println("| Spesifikasi Kendaraan |");
        System.out.println("Type\t\t\t: Super High Decker");
        System.out.println("Harga\t\t\t: 2000 Juta/unit");
        System.out.println("Ketinggian\t\t: 3,9 Meter");
        System.out.println("Kapasitas Penumpang\t: 50 Penumpang");
        System.out.println("Jenis Transmisi\t\t: Otomatis");
        System.out.println("Jenis Bahan Bakar\t: Diesel");
        System.out.println("Fitur Kenyamanan\t: AC, TV, Audio System, Toilet, Reclining Seats");
        System.out.println("=================================================================");
        System.out.println();
    }
    
}
