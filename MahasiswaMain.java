import java.util.Scanner;
public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int pilihan;
        do {
            System.out.println("\n===== MENU PENGELOLAHAN NILAI MAHASISWA =====");
            System.out.println("1. Tampilkan Data Mahasiswa");
            System.out.println("2. Tampilkan Data Mata Kuliah");
            System.out.println("3. Tampilkan Data penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Data Penilaian Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("=== DATA MAHASISWA ===");
                    break;
                case 2:
                    System.out.println("=== DATA MATA KULIAH ===");
                    break;
                case 3:
                    System.out.println("=== DATA PENILAIAN MAHASISWA ===");
                    break;
                case 4:
                    System.out.println("=== DATA MAHASISWA BERDASARKAN NILAI AKHIR (DESC) ===");
                    break;
                case 5:
                    System.out.println("=== HASIL PENCARIAN PENILAIAN ===");
                    break;
                case 0:
                    System.out.println("Keluar dari program !!!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih lagi.");
                    break;
            }
        } while (pilihan != 0);
        sc.close();
    }
}