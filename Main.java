public class Main {
    public static void main(String[] args) {
        Siswa siswa1 = new Siswa("Upin", 10);
        Siswa siswa2 = new Siswa("Ipin", 10);
        Guru guru1 = new Guru("Cikgu Jasmin", "Matematika");

        siswa1.tampilkanInfo();
        siswa1.belajar();

        System.out.println("------------------");

        siswa2.tampilkanInfo();
        siswa2.belajar();

        System.out.println("==================");

        guru1.tampilkanInfo();
        guru1.mengajar();
    }
}