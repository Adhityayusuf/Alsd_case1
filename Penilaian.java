class Penilaian {

    Mahasiswa mahasiswa;
    MataKuliah mataKuliah;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    public Penilaian(Mahasiswa mahasiswa, MataKuliah mataKuliah, double nilaiTugas, double nilaiUTS, double nilaiUAS) {
        this.mahasiswa = mahasiswa;
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        hitungNilaiAkhir();
    }

    public void hitungNilaiAkhir() {
        this.nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    public void tampilPenilaian() {
        System.out.println("NIM : " + mahasiswa.NIM);
        System.out.println("Nama : " + mahasiswa.nama);
        System.out.println("Mata Kuliah : " + mataKuliah.namaMK);
        System.out.println("Tugas : " + nilaiTugas);
        System.out.println("UTS : " + nilaiUTS);
        System.out.println("UAS : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public String getNIMMahasiswa() {
        return mahasiswa.NIM;
    }

    public static void tampilkanDataPenilaian(Penilaian[] daftarPenilaian) {
        System.out.println("\n=== DATA PENILAIAN MAHASISWA ===");
        for (int i = 0; i < daftarPenilaian.length; i++) {
            if (daftarPenilaian[i] != null) {
                daftarPenilaian[i].tampilPenilaian();
                System.out.println("-------------");
            }
        }
    }

    public static void urutkanDataPenilaianBubbleSort(Penilaian[] daftarPenilaian) {
        int n = daftarPenilaian.length;
        Penilaian temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (daftarPenilaian[j] != null && daftarPenilaian[j + 1] != null) {
                    if (daftarPenilaian[j].getNilaiAkhir() < daftarPenilaian[j + 1].getNilaiAkhir()) {
                        // swap arr[j+1] and arr[i]
                        temp = daftarPenilaian[j];
                        daftarPenilaian[j] = daftarPenilaian[j + 1];
                        daftarPenilaian[j + 1] = temp;
                    }
                }
            }
        }

        System.out.println("\nData Penilaian Setelah Diurutkan Berdasarkan Nilai Akhir (Bubble Sort):");
        for (int i = 0; i < daftarPenilaian.length; i++) {
            if (daftarPenilaian[i] != null) {
                daftarPenilaian[i].tampilPenilaian();
                System.out.println("-------------");
            }
        }
    }

    public static void cariDataPenilaianLinearSearch(Penilaian[] daftarPenilaian, String nimCari) {
        System.out.println("\nHasil Pencarian (Linear Search):");
        boolean found = false;
        for (int i = 0; i < daftarPenilaian.length; i++) {
            if (daftarPenilaian[i] != null && daftarPenilaian[i].getNIMMahasiswa().equals(nimCari)) {
                daftarPenilaian[i].tampilPenilaian();
                System.out.println("-------------");
                found = true;
            }
        }

        if (!found) {
            System.out.println("Data penilaian untuk NIM " + nimCari + " tidak ditemukan.");
        }
    }
}