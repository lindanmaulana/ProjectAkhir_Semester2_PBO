package Apps;
// import java.util.Scanner;
import java.io.*;

public class AppsPemesanan extends Kendaraan {
    private int jumlahPesan;

    public AppsPemesanan(String jenisKendaraan, String pesananKendaraan, int jumlah, long harga) {
        super(jenisKendaraan, pesananKendaraan, jumlah, harga);
    }

    public long jumlahTagihan(int jumlah, long harga) {
        return harga * jumlah;
    }

    public static void main(String[] args) throws IOException {
        long tagihan;
        String sistem;

        AppsPemesanan app = new AppsPemesanan("","",0, 0);
        app.Opening();
        
        // Initial objek dari class class
        MenuKendaraan menu = new MenuKendaraan();
        Motor classMotor = new Motor();
        MobilKeluarga classMobilKeluarga = new MobilKeluarga();
        MobilBus classMobilBus = new MobilBus();

        // Set up I/O
        InputStream data = System.in;
        InputStreamReader teks = new InputStreamReader(data);
        BufferedReader reader = new BufferedReader(teks);

        // Start program
        do {
            // MENU
            menu.pilihanMenuKendaraan();
            System.out.print("Pilih Jenis Kendaraan: ");
            BufferedReader m = new BufferedReader(teks);
            int pilihanJenis = Integer.parseInt(m.readLine());

            if(pilihanJenis == 1) {
                menu.setJenisKendaraan("Motor");
            
                // MOTOR
                classMotor.pilihanMotor();
                System.out.print("Pilih Type Motor Anda: ");
                int pilihMotor = Integer.parseInt(reader.readLine());

                System.out.print("Berapa Unit yang anda Pesan: ");
                int pesan = Integer.parseInt(reader.readLine());
                app.jumlahPesan = pesan;

                if(pilihMotor == 1) {
                    classMotor.setMotor(classMotor.getKawasaki());
                    tagihan = app.jumlahTagihan(app.jumlahPesan, classMotor.getHargaZx());
                    classMotor.setHarga(tagihan);
                    classMotor.spekKawasaki();

                } else if(pilihMotor == 2) {
                    classMotor.setMotor(classMotor.getYamaha());
                    tagihan = app.jumlahTagihan(app.jumlahPesan, classMotor.getHargaR1M());
                    classMotor.setHarga(tagihan);
                    classMotor.spekYamaha();

                } else if(pilihMotor == 3) {
                    classMotor.setMotor(classMotor.getBmw());
                    tagihan = app.jumlahTagihan(app.jumlahPesan, classMotor.getHargaBmw());
                    classMotor.setHarga(tagihan);
                    classMotor.spekDucati();

                }

                System.out.print("Selesaikan Pemesanan ? (y/n)");
                String info = reader.readLine();

                if(info.equals("y")) {
                    AppsPemesanan pesanan = new AppsPemesanan(menu.getJenisKendaraan(), classMotor.getMotor(), app.jumlahPesan, classMotor.getHarga());
                    
                    pesanan.detailPesanan();
                } else {
                    app.pembatalanPesanan();
                }

            } else if(pilihanJenis == 2) {
                menu.setJenisKendaraan("Mobil Keluarga");

                // MOBIL KELUARGA
                classMobilKeluarga.pilihanMobilKeluarga();
                System.out.print("Pilih Type Mobil Keluarga Anda: ");
                int pilihMobilKeluarga = Integer.parseInt(reader.readLine());

                System.out.print("Berapa Unit yang anda Pesan: ");
                int pesan = Integer.parseInt(reader.readLine());
                app.jumlahPesan = pesan;

                if(pilihMobilKeluarga == 1) {
                    classMobilKeluarga.setMobilKeluarga(classMobilKeluarga.getAvanza());
                    tagihan = app.jumlahTagihan(app.jumlahPesan, classMobilKeluarga.getHargaAvanza());
                    classMobilKeluarga.setHarga(tagihan);
                    classMobilKeluarga.spekAvanza();

                } else if(pilihMobilKeluarga == 2) {
                    classMobilKeluarga.setMobilKeluarga(classMobilKeluarga.getGrandmax());
                    tagihan = app.jumlahTagihan(app.jumlahPesan, classMobilKeluarga.getHargaGrandmax());
                    classMobilKeluarga.setHarga(tagihan);
                    classMobilKeluarga.spekGrandmax();

                } else if(pilihMobilKeluarga == 3) {
                    classMobilKeluarga.setMobilKeluarga(classMobilKeluarga.getLuxio());
                    tagihan = app.jumlahTagihan(app.jumlahPesan, classMobilKeluarga.getHargaLuxio());
                    classMobilKeluarga.setHarga(tagihan);
                    classMobilKeluarga.spekLuxio();

                }

                System.out.print("Selesaikan Pemesanan ? (y/n)");
                String info = reader.readLine();

                if(info.equals("y")) {
                    AppsPemesanan pesanan = new AppsPemesanan(menu.getJenisKendaraan(), classMobilKeluarga.getMobilKeluarga(), app.jumlahPesan, classMobilKeluarga.getHarga());
                    
                    pesanan.detailPesanan();
                } else {
                    app.pembatalanPesanan();
                }

            } else if(pilihanJenis == 3) {
                menu.setJenisKendaraan("Mobil Bus");

                // MOBIL BUS
                classMobilBus.pilihanMobilBus();
                System.out.print("Pilih Type Mobil Bus Anda: ");
                int pilihMobilBus = Integer.parseInt(reader.readLine());

                System.out.print("Berapa Unit yang anda Pesan: ");
                int pesan = Integer.parseInt(reader.readLine());
                app.jumlahPesan = pesan;

                if(pilihMobilBus == 1) {
                    classMobilBus.setMobilBus(classMobilBus.getBusNormalDeck());
                    tagihan = app.jumlahTagihan(app.jumlahPesan, classMobilBus.getHargaNormalDeck());
                    classMobilBus.setHarga(tagihan);
                    classMobilBus.spekNormalDecker();

                } else if(pilihMobilBus == 2) {
                    classMobilBus.setMobilBus(classMobilBus.getBusHighDecker());
                    tagihan = app.jumlahTagihan(app.jumlahPesan, classMobilBus.getHargaHighDecker());
                    classMobilBus.setHarga(tagihan);
                    classMobilBus.spekHighDecker();

                } else if(pilihMobilBus == 3) {
                    classMobilBus.setMobilBus(classMobilBus.getBusSuperHighDecker());
                    tagihan = app.jumlahTagihan(app.jumlahPesan, classMobilBus.getHargaSuperHighDecker());
                    classMobilBus.setHarga(tagihan);
                    classMobilBus.spekSuperHighDecker();

                }

                System.out.print("Selesaikan Pemesanan ? (y/n)");
                String info = reader.readLine();

                if(info.equals("y")) {
                    AppsPemesanan pesanan = new AppsPemesanan(menu.getJenisKendaraan(), classMobilBus.getmobilBus(), app.jumlahPesan, classMobilBus.getHarga());
                    
                    pesanan.detailPesanan();
                } else {
                    app.pembatalanPesanan();
                }
            }

            System.out.print("Apakah anda ingin memesan yang lain ? (y/n) ");
            sistem = reader.readLine();
            
        } while(sistem.equals("y"));

        app.Closing();
    }
}