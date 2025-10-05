package Modul_10;

public class UndergraduateStudent extends Student {
    // Konstruktor untuk menginisialisasi nama mahasiswa
    public UndergraduateStudent(String studentName) {
        super(studentName); // Memanggil konstruktor superclass dengan nama mahasiswa
    }

    // Metode untuk mendapatkan grade kursus berdasarkan nilai akhir
    public String getCourseGrade() {
        int nilaiFinal = hitungNilaiAkhir(); // Mendapatkan nilai akhir
        if (nilaiFinal >= 80) { // Jika nilai akhir lebih besar atau sama dengan 80
            return "A"; // Mengembalikan grade "A"
        } else if (nilaiFinal >= 70) { // Jika nilai akhir lebih besar atau sama dengan 70
            return "B"; // Mengembalikan grade "B"
        } else if (nilaiFinal >= 56) { // Jika nilai akhir lebih besar atau sama dengan 56
            return "C"; // Mengembalikan grade "C"
        } else if (nilaiFinal >= 45) { // Jika nilai akhir lebih besar atau sama dengan 45
            return "D"; // Mengembalikan grade "D"
        } else { // Jika nilai akhir kurang dari 45
            return "E"; // Mengembalikan grade "E"
        }
    }

    // Metode privat untuk menghitung nilai akhir berdasarkan tes
    private int hitungNilaiAkhir() {
        // Variabel untuk menyimpan total nilai tes
        int total = 0;
        // Iterasi melalui setiap nilai tes
        for (int nilai : test) {
            total += nilai; // Menambahkan nilai tes ke total
        }
        // Mengembalikan rata-rata nilai tes
        return total / NUM_OF_TESTS;
    }
}

