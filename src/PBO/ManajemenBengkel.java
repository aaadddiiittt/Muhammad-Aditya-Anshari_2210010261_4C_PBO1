package PBO;

// File: ManajemenBengkel.java
import java.util.Scanner;

public class ManajemenBengkel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Sistem Manajemen Bengkel");

        // Perulangan untuk input data kendaraan
        System.out.print("Masukkan jumlah kendaraan: ");
        int jumlahKendaraan = Integer.parseInt(scanner.nextLine());
        Kendaraan[] kendaraan = new Kendaraan[jumlahKendaraan];

        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.println("\nMasukkan detail untuk Kendaraan " + (i + 1));

            System.out.print("Merk: ");
            String merk = scanner.nextLine();
            System.out.print("Model: ");
            String model = scanner.nextLine();
            int tahun = 0;
            boolean inputValid = false;
            while (!inputValid) {
                try {
                    System.out.print("Tahun: ");
                    tahun = Integer.parseInt(scanner.nextLine());
                    inputValid = true;
                } catch (NumberFormatException e) {
                    System.out.println("Masukkan tahun dalam bentuk bilangan bulat.");
                }
            }

            // Seleksi untuk jenis kendaraan (misalnya mobil atau motor)
            System.out.print("Apakah ini mobil? (ya/tidak): ");
            String pilihan = scanner.nextLine().toLowerCase();

            if (pilihan.equals("ya")) {
                System.out.print("Jumlah pintu: ");
                int jumlahPintu = Integer.parseInt(scanner.nextLine());
                kendaraan[i] = new Mobil(merk, model, tahun, jumlahPintu);
            } else {
                // Implementasi untuk jenis kendaraan lainnya (misalnya motor)
                System.out.println("Maaf, hanya mobil yang didukung dalam contoh ini.");
                i--; // Mengulang input untuk kendaraan ke-i
            }
        }

        // Output
        System.out.println("\nDaftar Kendaraan:");
        for (Kendaraan k : kendaraan) {
            if (k != null) {
                System.out.println(k);
            }
        }

        scanner.close();
    }
}
