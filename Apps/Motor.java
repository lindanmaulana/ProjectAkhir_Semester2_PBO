package Apps;

public class Motor {
    // enkapsulasi
    private String pickMotor;
    private long harga;
    private String motorKawasaki = "Kawasaki ZX25R";
    private String motorYamaha = "Yamaha R1M";
    private String motorBmw = "Bmw Panigale";
    private int hargaZx = 125;
    private int hargaR1M = 812;
    private int hargaBmw = 1979;
    
    // setter & getter
    public void setMotor(String pickMotor) {
        this.pickMotor = pickMotor;
    }

    public String getMotor() {
        return pickMotor;
    }

    public void setHarga(long harga) {
        this.harga = harga;
    }

    public long getHarga() {
        return harga;
    }

    public int getHargaZx() {
        return hargaZx;
    }

    public int getHargaR1M() {
        return hargaR1M;
    }

    public int getHargaBmw() {
        return hargaBmw;
    }

    public String getKawasaki() {
        return motorKawasaki;
    }

    public String getYamaha() {
        return motorYamaha;
    }

    public String getBmw() {
        return motorBmw;
    }
    
    // method all
    public void pilihanMotor() {
        System.out.println("===================");
        System.out.println("1. Kawasaki ZX25R");
        System.out.println("2. Yamaha R1M");
        System.out.println("3. BMW Panigale");
        System.out.println("===================");
    }

    public void spekKawasaki() {
        System.out.println("============================");
        System.out.println("| Spesifikasi Kendaraan |");
        System.out.println("Type\t\t: Kawasaki ZX25R");
        System.out.println("Kategori\t: Sport ");
        System.out.println("Harga\t\t: 125 Juta/unit");
        System.out.println("Kapasitas\t: 249.8 cc");
        System.out.println("KapasitasTangki\t: 15L");
        System.out.println("Berat\t\t: 182Kg");
        System.out.println("============================");
        System.out.println();
    }

    public void spekYamaha() {
        System.out.println("============================");
        System.out.println("| Spesifikasi Kendaraan |");
        System.out.println("Type\t\t: Yamaha R1M");
        System.out.println("Kategori\t: Sport ");
        System.out.println("Harga\t\t :812 Juta/unit");
        System.out.println("Kapasitas\t: 998 cc");
        System.out.println("KapasitasTangki\t: 17L");
        System.out.println("Berat\t\t: 199Kg");
        System.out.println("============================");
        System.out.println();
    }

    public void spekDucati() {
        System.out.println("============================");
        System.out.println("| Spesifikasi Kendaraan |");
        System.out.println("Type\t\t: BMW Panigale");
        System.out.println("Kategori\t: Sport ");
        System.out.println("Harga\t\t: 1979 Juta/unit");
        System.out.println("Kapasitas\t: 998 cc");
        System.out.println("KapasitasTangki\t: 16L");
        System.out.println("Berat\t\t: 184Kg");
        System.out.println("============================");
        System.out.println();
    }
    
}
