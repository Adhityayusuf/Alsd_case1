public class Mahasiswa {
    String NIM;
    String Nama;
    String Prodi;

    Mahasiswa(String nim,String nm,String prodi) {
        NIM = nim;
        Nama = nm;
        Prodi = prodi;

    }

    void tampilMahasiswa() {
        System.out.println("Nim\t : "+ NIM);
        System.out.println(("Nama\t : "+ Nama));
        System.out.println("Prodi\t : "+Prodi);
        System.out.println("---------------------");
    }
    
}