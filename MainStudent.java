package Modul_10;

public class MainStudent {
    public static void main(String[] args) {
        // Membuat objek GraduateStudent
        GraduateStudent gradStudent = new GraduateStudent("Eugenius Kriswinar Adi Cahya"); // Membuat objek GraduateStudent dengan nama "Eugenius Kriswinar Adi Cahya"
        gradStudent.setTestScore(0, 90); // Mengatur nilai tes pertama menjadi 90
        gradStudent.setTestScore(1, 85); // Mengatur nilai tes kedua menjadi 85
        gradStudent.setTestScore(2, 88); // Mengatur nilai tes ketiga menjadi 88
        System.out.println("Graduate Student: " + gradStudent.getName()); // Mencetak nama graduate student
        System.out.println("Test Scores: " + gradStudent.getTestScore(0) + ", " + gradStudent.getTestScore(1) + ", " + gradStudent.getTestScore(2)); // Mencetak nilai tes
        System.out.println("Course Grade: " + gradStudent.getCourseGrade()); // Mencetak grade kursus berdasarkan nilai tes
        
        // Membuat objek UndergraduateStudent
        UndergraduateStudent undergradStudent = new UndergraduateStudent("Gracia Vania Noviantika"); // Membuat objek UndergraduateStudent dengan nama "Gracia Vania Noviantika"
        undergradStudent.setTestScore(0, 75); // Mengatur nilai tes pertama menjadi 75
        undergradStudent.setTestScore(1, 80); // Mengatur nilai tes kedua menjadi 80
        undergradStudent.setTestScore(2, 70); // Mengatur nilai tes ketiga menjadi 70
        System.out.println("\nUndergraduate Student: " + undergradStudent.getName()); // Mencetak nama undergraduate student
        System.out.println("Test Scores: " + undergradStudent.getTestScore(0) + ", " + undergradStudent.getTestScore(1) + ", " + undergradStudent.getTestScore(2)); // Mencetak nilai tes
        System.out.println("Course Grade: " + undergradStudent.getCourseGrade()); // Mencetak grade kursus berdasarkan nilai tes
    }
}

