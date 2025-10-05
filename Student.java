package Modul_10;

public class Student implements Learner {
    // Konstanta untuk jumlah tes
    protected final static int NUM_OF_TESTS = 3;
    
    // Atribut untuk menyimpan nama siswa
    protected String name;
    
    // Atribut untuk menyimpan array nilai tes
    protected int[] test;
    
    // Atribut untuk menyimpan grade kursus
    protected String courseGrade;

    // Konstruktor tanpa parameter
    public Student() {
        this(""); // Memanggil konstruktor dengan parameter string kosong
    }

    // Konstruktor dengan parameter nama siswa
    public Student(String studentName) {
        name = studentName; // Mengatur nama siswa
        test = new int[NUM_OF_TESTS]; // Inisialisasi array nilai tes
    }

    // Getter untuk mendapatkan grade kursus
    public String getCourseGrade() {
        return courseGrade; // Mengembalikan grade kursus
    }

    // Getter untuk mendapatkan nama siswa
    public String getName() {
        return name; // Mengembalikan nama siswa
    }

    // Setter untuk mengubah nama siswa
    public void setName(String name) {
        this.name = name; // Mengatur nama siswa baru
    }

    // Getter untuk mendapatkan nilai tes pada indeks tertentu
    public int getTestScore(int testNumber) {
        return test[testNumber]; // Mengembalikan nilai tes pada indeks yang ditentukan
    }

    // Setter untuk mengubah nilai tes pada indeks tertentu
    public void setTestScore(int testNumber, int score) {
        this.test[testNumber] = score; // Mengatur nilai tes pada indeks yang ditentukan
    }
}
