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
        System.out.println("NIM         : " + mahasiswa.NIM);
        System.out.println("Nama        : " + mahasiswa.nama);
        System.out.println("Mata Kuliah : " + mataKuliah.namaMK);
        System.out.println("Tugas       : " + nilaiTugas);
        System.out.println("UTS         : " + nilaiUTS);
        System.out.println("UAS         : " + nilaiUAS);
        System.out.println("Nilai Akhir : " + nilaiAkhir);
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public String getNIMMahasiswa() {
        return mahasiswa.NIM;
    }
}