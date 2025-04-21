import java.util.Scanner;

public class MahasiswaMain {

    static Mahasiswa[] daftarMahasiswa = new Mahasiswa[3];
    static MataKuliah[] daftarMataKuliah = new MataKuliah[3];
    static Penilaian[] daftarPenilaian = new Penilaian[5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== KELOMPOK 01 ALSD =====");
        System.out.println("NAMA : M.ADHITYA YUSUF AL-AYYUBI");
        System.out.println("NAMA : FAATIHURRIZKI PRASOJO");
        System.out.println("NAMA : DIMAS HANDARHESKY");
        System.out.println("=================================");
        System.out.println();

        // Inisialisasi data
        inisialisasiData();

        int pilihan;

        do {
            tampilkanMenu();
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (pilihan) {
                case 1:
                    tampilkanDataMahasiswa();
                    break;
                case 2:
                    tampilkanDataMataKuliah();
                    break;
                case 3:
                    Penilaian.tampilkanDataPenilaian(daftarPenilaian);
                    break;
                case 4:
                    Penilaian.urutkanDataPenilaianBubbleSort(daftarPenilaian); // Menggunakan Bubble Sort
                    break;
                case 5:
                    System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                    String nimCari = scanner.nextLine();
                    Penilaian.cariDataPenilaianLinearSearch(daftarPenilaian, nimCari);
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);

        scanner.close();
    }

    // Method untuk inisialisasi data
    static void inisialisasiData() {
        daftarMahasiswa[0] = new Mahasiswa("22001", "Ali Rahman", "TI");
        daftarMahasiswa[1] = new Mahasiswa("22002", "Budi Santoso", "SIB");
        daftarMahasiswa[2] = new Mahasiswa("22003", "Citra Dewi", "TI");

        daftarMataKuliah[0] = new MataKuliah("MK001", "Struktur Data", 3);
        daftarMataKuliah[1] = new MataKuliah("MK002", "Basis Data", 3);
        daftarMataKuliah[2] = new MataKuliah("MK003", "Desain Web", 2);

        daftarPenilaian[0] = new Penilaian(daftarMahasiswa[0], daftarMataKuliah[0], 80, 85, 90);
        daftarPenilaian[1] = new Penilaian(daftarMahasiswa[0], daftarMataKuliah[1], 60, 75, 70);
        daftarPenilaian[2] = new Penilaian(daftarMahasiswa[1], daftarMataKuliah[0], 75, 70, 80);
        daftarPenilaian[3] = new Penilaian(daftarMahasiswa[2], daftarMataKuliah[1], 85, 90, 95);
        daftarPenilaian[4] = new Penilaian(daftarMahasiswa[2], daftarMataKuliah[2], 80, 90, 65);
    }

    // Method untuk menampilkan menu
    static void tampilkanMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Tampilkan Data Mahasiswa");
        System.out.println("2. Tampilkan Data Mata Kuliah");
        System.out.println("3. Tampilkan Data Penilaian");
        System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
        System.out.println("5. Cari Data Penilaian Mahasiswa Berdasarkan NIM");
        System.out.println("0. Keluar");
    }

    // Method untuk menampilkan data mahasiswa
    static void tampilkanDataMahasiswa() {
        System.out.println("\n=== DATA MAHASISWA ===");
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            if (daftarMahasiswa[i] != null) {
                daftarMahasiswa[i].tampilMahasiswa();
                System.out.println("-------------");
            }
        }
    }

    // Method untuk menampilkan data mata kuliah
    static void tampilkanDataMataKuliah() {
        System.out.println("\n=== DATA MATA KULIAH ===");
        for (int i = 0; i < daftarMataKuliah.length; i++) {
            if (daftarMataKuliah[i] != null) {
                daftarMataKuliah[i].tampilMatakuliah();
                System.out.println("-------------");
            }
        }
    }
}
