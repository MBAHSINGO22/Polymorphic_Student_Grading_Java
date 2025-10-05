
# 📝 Polymorphic Student Grading Java

## 📖 Deskripsi Proyek
Proyek pembelajaran Java yang mendemonstrasikan penggunaan **pewarisan, polimorfisme, dan interface** untuk mengelola data mahasiswa S1 (Undergraduate) dan S2 (Graduate) dengan skala penilaian yang berbeda.  
Program ini menghitung nilai akhir berdasarkan **rata-rata tiga nilai tes** dan menetapkan **grade kursus** berdasarkan kriteria masing-masing jenjang.

## 🧠 Fitur Utama
- Menggunakan **interface** `Learner` untuk mendefinisikan kontrak metode `getCourseGrade()`.
- Kelas abstrak `Student` sebagai induk, menyimpan atribut nama dan nilai tes.
- Kelas `GraduateStudent` dan `UndergraduateStudent` mengimplementasikan logika grading berbeda.
- Demonstrasi **polimorfisme** melalui pemanggilan metode yang sama (`getCourseGrade`) dengan hasil berbeda.

---

## 📂 Struktur Proyek
```
Polymorphic_Student_Grading_Java/
├── src/Modul_10/
├── MainStudent.java            # 🛠️ Kelas utama untuk pengujian
├── Student.java                # 📊 Kelas induk mahasiswa
├── GraduateStudent.java        # 🎓 Mahasiswa S2
├── UndergraduateStudent.java   # 🎓 Mahasiswa S1
├── Learner.java                # 📋 Interface untuk grade kursus
```

---

## 🟢 Catatan
- Nilai akhir = rata-rata tiga nilai tes.
- Skala konversi nilai:
  - **S1:** A ≥ 80, B ≥ 70, C ≥ 56, D ≥ 45, E < 45
  - **S2:** A ≥ 85, B ≥ 70, C ≥ 56, D ≥ 45, E < 45
- Program menggunakan polimorfisme melalui interface `Learner`.

---

## 📈 Contoh Output

### 💻 Hasil Program:
```
Graduate Student: Eugenius Kriswinar Adi Cahya
Test Scores: 90, 85, 88
Course Grade: A

Undergraduate Student: Gracia Vania Noviantika
Test Scores: 75, 80, 70
Course Grade: B
```

---

## 👨‍💻 Pengembang
**Username:** MBAHSINGO22  
📌 GitHub: [https://github.com/MBAHSINGO22](https://github.com/MBAHSINGO22)
