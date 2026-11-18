// Kelas untuk menghitung nilai akhir mahasiswa
class StudentGrader {
    public double hitungNilaiAkhir(
        double tugas, double uts, double uas) {

        // Menghitung nilai berdasarkan bobot masing-masing
        return (tugas * 0.3) +
               (uts * 0.3) +
               (uas * 0.4);
    }
}

// Kelas khusus untuk mencetak laporan nilai
class GradeReport {
    public void cetakLaporan(String nama, double nilai) {

        // Menampilkan laporan nilai mahasiswa
        System.out.println(
            "Laporan Nilai Mahasiswa: " +
            nama + " = " + nilai
        );
    }
}

// Kelas khusus untuk menyimpan data nilai mahasiswa
class GradeRepository {
    public void simpanDatabase(String nama, double nilai) {

        // Menampilkan proses penyimpanan data ke database
        System.out.println(
            "Menyimpan ke database: " +
            nama + " = " + nilai
        );
    }
}

// Kelas utama program
public class Latihan2Penilaian {
    public static void main(String[] args) {

        // Membuat objek untuk setiap tanggung jawab
        StudentGrader grader = new StudentGrader();
        GradeReport report = new GradeReport();
        GradeRepository repository = new GradeRepository();

        // Menghitung nilai akhir mahasiswa
        double nilai = grader.hitungNilaiAkhir(80, 85, 90);

        // Mencetak laporan nilai mahasiswa
        report.cetakLaporan("Andi", nilai);

        // Menyimpan nilai mahasiswa
        repository.simpanDatabase("Andi", nilai);
    }
}
