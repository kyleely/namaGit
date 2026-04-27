public class Guru {
    String nama;
    String mapel;

    public Guru(String nama, String mapel) {
        this.nama = nama;
        this.mapel = mapel;
    }

    public void mengajar() {
        System.out.println(nama + " sedang mengajar " + mapel);
    }

    public void tampilkanInfo() {
        System.out.println("Nama Guru: " + nama);
        System.out.println("Mata Pelajaran: " + mapel);
    }
}