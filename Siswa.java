public class Siswa {
    String nama;
    int umur;

    public Siswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void belajar() {
        System.out.println(nama + " sedang belajar.");
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
    }
}