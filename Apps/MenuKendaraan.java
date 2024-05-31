package Apps;

public class MenuKendaraan {
    private String jenisKendaraan;
    
    public void setJenisKendaraan(String jenisKendaraan) {
        this.jenisKendaraan = jenisKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public void pilihanMenuKendaraan() {
        System.out.println("===================");
        System.out.println("1. Motor");
        System.out.println("2. Mobil Keluarga");
        System.out.println("3. Mobil Bus");
        System.out.println("===================");
    }
}
